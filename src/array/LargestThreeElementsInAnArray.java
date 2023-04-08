package array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestThreeElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 4, 9, 10,10};
        largestThreeElementsUsing7(arr);
    }

    public static void largestThreeElementsUsing8(int[] arr) {
       /* IntStream.of(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);*/
       Arrays.stream(arr).boxed().
               sorted(Comparator.reverseOrder())
               .distinct()
               .limit(3)
               .forEach(System.out::println);
    }
    public static void largestThreeElementsUsing7(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int check =0;
        int count = 1;
        for(int i=1; i<= n; i++) {
            if (count < 4) {
                if (check != arr[n - i]) {
                    System.out.println(arr[n-i]);
                     count++;
                    check = arr[n-i];
                    System.out.println();
                }
            }
            else{
                break;
            }
        }

    }
}
