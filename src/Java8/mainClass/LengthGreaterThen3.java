package Java8.mainClass;

import java.util.Arrays;
import java.util.List;

public class LengthGreaterThen3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        lengthGreaterThen3(stringList);
    }
    public static void lengthGreaterThen3(List<String> list){
        list.stream()
                .filter(str->str.length()>3)
                .forEach(System.out::println);
    }
}
