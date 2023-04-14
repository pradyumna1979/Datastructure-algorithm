package immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ImmutableClass {
    private final int id;

    private final String name;

    private final Map<String,String> testMap;

    public Date getDate() {
        return (Date)date.clone();
    }

    private final Date date;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter function for mutable objects

    public Map<String, String> getTestMap() {
        return testMap;
    }

    // Constructor method performing deep copy

    public ImmutableClass(int i, String n, Map<String,String> hm, Date date){
        System.out.println("Performing Deep Copy for Object initialization");
        Date date1 = new Date();
        date1.setTime(date.getTime());
        // "this" keyword refers to the current object
        this.id=i;
        this.name=n;
        this.date=date1;
        this.testMap =  hm.entrySet().stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue) );
    }

    // Test the immutable class

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
        String s = "original";
        int i=10;
        Date date = new Date();
        date.setTime(15);
        ImmutableClass ce = new ImmutableClass(i,s,h1,date);
        // print the ce values
        System.out.println("ce :"+ce);
        // change the local variable values
        i=20;
        s="modified";
        h1.put("3", "third");
        Date date1 = ce.getDate();
        date1.setTime(20);
        System.out.println("ce :"+ce);

    }

    @Override
    public String toString() {
        return "immutable.ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testMap=" + testMap +
                ", date=" + date.getTime() +
                '}';
    }
}
