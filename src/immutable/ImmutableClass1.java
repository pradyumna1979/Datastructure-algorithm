package immutable;

import java.util.*;

public final class ImmutableClass1 {
    private final int id;
    private final String name;
    private final HashMap<String, String> map;
    private final Date date;
    public Date getDate() {
        return (Date) date.clone();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    // Getter function for mutable objects
    public HashMap<String, String> getMap() {
        return (HashMap<String, String>) map.clone();
    }

    // Constructor method performing deep copy
    public ImmutableClass1(int id, String name, HashMap<String, String> map, Date date) {
        this.id = id;
        this.name=name;
        HashMap<String,String> copyMap = new HashMap<>();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            copyMap.put(key,map.get(key));
        }
        this.map = copyMap;
        Date date1 = new Date();
        date1.setTime(date.getTime());
        this.date = date1;
    }
    // Test the immutable class

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");
        String s = "original";
        int i = 10;
        Date date = new Date();
        date.setTime(15);
        ImmutableClass1 ce = new ImmutableClass1(i, s, h1, date);

        // print the ce values
        System.out.println("ce :" + ce);
        // change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        HashMap<String,String> map1 = ce.getMap();
        map1.put("4","pkk");
        Date date1 = ce.getDate();
        date1.setTime(20);
        System.out.println("ce :" + ce);

    }

    @Override
    public String toString() {
        return "immutable.ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testMap=" + map +
                ", date=" + date.getTime() +
                '}';
    }
}
