package arraylist;

import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;
    protected transient int modCount = 0;
    private  int size = 0;
    public static final int SOFT_MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
    public static final int NEW_CAPACITY = 1000;


    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }

    private void add(E e, Object[] elementData, int s) {
        if(s == elementData.length)
            elementData=grow();
        elementData[s] = e;
        size = s + 1;
    }

    private Object[] grow() {
        return grow(size+1);
    }
    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return elementData = Arrays.copyOf(elementData, NEW_CAPACITY);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return  elementData(index);
    }
    E elementData(int index) {
        return (E) elementData[index];
    }
}
