package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArrangeGivenNumbersToFormTheBiggestNumber {
    public static void main(String[] args) {
        int[] array = {546,54,548,60};
        Comparator<String> comparator = (a,b) ->{
            String ab = a+b;
            String ba = b+a;
            return ba.compareTo(ab);
        };
        String largest = Arrays.stream(array).boxed()
                .map(String::valueOf)
                .sorted(comparator)
                .collect(Collectors.joining());
        System.out.println(largest);
    }
}
