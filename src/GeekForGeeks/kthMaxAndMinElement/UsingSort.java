package GeekForGeeks.kthMaxAndMinElement;

import java.util.Arrays;
import java.util.PriorityQueue;

public class UsingSort {
    public static int kthMaxOrMinElement(int[] arr, int k){
       Arrays.sort(arr);
       return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int val = kthMaxOrMinElement(arr,2);
        System.out.println(val);
    }
}
