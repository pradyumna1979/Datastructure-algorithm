package Java8.mainClass;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumberOfWords {
    public static void main(String[] args) {
        String str = "Pradyumna Pradyumna Kumar Khadanga";
        Map<String,Long> map = Stream.of(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
