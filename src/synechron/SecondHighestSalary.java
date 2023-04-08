package synechron;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondHighestSalary {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        System.out.println(getSecondHighestSalary(numbers));
    }

    public static Integer getSecondHighestSalary(int[] array) {
        int secondLargestNumber = Arrays
                .stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        return secondLargestNumber;
    }
}
