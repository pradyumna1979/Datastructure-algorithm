package sorting;

import java.util.Arrays;

public class BoubleSorting {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2};
        sort(arr);
    }
    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSwaped = false;
            for(int j = 1; j < n-i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                    isSwaped = true;
                }
            }
            if(!isSwaped){
                break;
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
