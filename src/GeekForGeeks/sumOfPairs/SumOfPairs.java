package GeekForGeeks.sumOfPairs;

import java.util.Arrays;

public class SumOfPairs {
    public static void sumOfPairs(int[] arr, int sum){
        int low = 0;
        int high = arr.length-1;
        while (low < high){
            if(arr[low] + arr[high] == sum){
                System.out.println("("+arr[low]+","+arr[high]+")");
                low++;
                high--;
            } else if (arr[low] + arr[high] > sum) {
                high--;
            }else{
                low++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,-2,6,8,9,11};
        Arrays.sort(arr);
        sumOfPairs(arr, 6);
    }
}
