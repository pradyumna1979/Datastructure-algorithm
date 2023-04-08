package Java8.mainClass;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumberOfCharacters {
    public static void main(String[] args) {
        String str = "Pradyumna";
        numberOfCharacter8(str);
    }

    private static void numberOfCharacter8(String str) {
        Map<String,Long> map = Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
    private static void numberOfCharacter(String str) {
        int[] array = new int[128];
        for(int i=0; i < str.length(); i++){
            array[str.charAt(i)]++;
        }
    }

}
