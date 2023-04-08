package sorting.cyclicSorting;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        sort(arr);
        int firstMissingPositiveNo = firstMissingPositive(arr);
        System.out.println(firstMissingPositiveNo);
    }

    private static int firstMissingPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length;
    }

    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
