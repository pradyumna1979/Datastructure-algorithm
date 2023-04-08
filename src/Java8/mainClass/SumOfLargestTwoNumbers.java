package Java8.mainClass;

import java.util.Arrays;
import java.util.Comparator;

public class   SumOfLargestTwoNumbers {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,5,7,4,200,7,6,8,7};
        int largest = sumOfLargestTwoNumbers(array);
        System.out.println(largest);
    }

    private static Integer sumOfLargestTwoNumbers(int[] array) {
                return Arrays.stream(array)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .limit(2)
                        .reduce(0,Integer::sum);

    }
}
