package singleton;

import javax.naming.OperationNotSupportedException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class Singleton implements Cloneable, Serializable {
    private static volatile Singleton instance;

    private Singleton() throws OperationNotSupportedException {
        if (instance != null) {
            throw new OperationNotSupportedException("Object creation not supported");
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }

    public static Singleton getInstance() throws OperationNotSupportedException {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

class SingletonTest {
    public static void main(String[] args) throws OperationNotSupportedException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 : hashcode" + singleton1.hashCode());
        System.out.println("singleton2 : hashcode" + singleton2.hashCode());

        //Serialization Breaks the SingleTon
        try {
            Singleton instance1 = Singleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(
                    new FileOutputStream("file.text"));

            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(
                    new FileInputStream("file.text"));
            Singleton instance2
                    = (Singleton)in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        //reflection Destroy singleton using
        Singleton singleton3 = null;
        Constructor<?>[] constructors
                = Singleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            singleton3 = (Singleton) constructor.newInstance();
            System.out.println("singleton3 reflection:" + singleton3);
            break;
        }
        //Cloning Breaks the Singleton
        Singleton singleton4 = (Singleton) singleton1.clone();
        System.out.println("singleton4" + singleton4);

    }
}
