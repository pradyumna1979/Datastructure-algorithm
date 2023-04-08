package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,5,6,6};
        removeDuplicates(arr);
       // System.out.println(Arrays.toString(removed));
    }
    private static void removeDuplicates(int[] arr){
        int k=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[k++]= arr[i-1];
            }
        }
        arr[k]=arr[arr.length-1];
        for (int i = 0; i <=k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
