package subArray.zeroSumSubArray;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumPart1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int[] arr1={-3, 2, 3, 1, 6};
        boolean isZeroSumSubArrayExists = isZeroSum(arr);
        System.out.println(isZeroSumSubArrayExists);//true
        System.out.println(isZeroSum(arr1));//false
    }

    private static boolean isZeroSum(int[] arr) {
        int prefixSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if(prefixSum ==0 || arr[i] == 0 || set.contains(prefixSum)){
                return true;
            }
            set.add(prefixSum);
        }
        return  false;
    }
}
