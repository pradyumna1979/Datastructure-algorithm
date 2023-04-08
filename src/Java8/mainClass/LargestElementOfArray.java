package Java8.mainClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LargestElementOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,5,7,4,200,7,6,8,7};
        int largest = getLargestElement(array);
        System.out.println(largest);
    }

    private static Integer getLargestElement(int[] array) {
                int max = Arrays.stream(array)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .findFirst()
                        .get();
                return max;
    }
}
