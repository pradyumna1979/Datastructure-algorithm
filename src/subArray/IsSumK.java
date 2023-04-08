package subArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IsSumK {
    public static void main(String[] args) {
        int[] arr = {3,34,4,12,5,2};
        int target = 7;
        boolean isSum = findSubArrays(arr,target);
        System.out.println(isSum);
    }
    private static boolean findSubArrays(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> subList = new ArrayList<>();
                for (int k = i; k <= j; k++)
                    subList.add(arr[k]);
                if(subList.stream().reduce(0,Integer::sum)==target) {
                    System.out.println(subList.stream().map(String::valueOf).collect(Collectors.joining(",")));
                    return true;
                }
            }
        }
        return false;
    }
}
