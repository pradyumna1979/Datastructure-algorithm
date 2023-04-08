package sorting.cyclicSorting;

import java.util.Arrays;

public class CycleSorting {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
    }
    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
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
