package sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {-1,-2,0,2,1};
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
                 int endIndex = n-i-1;
                 int maxIndex = maxIndex(arr,0,endIndex);
                 swap(arr,maxIndex,endIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int maxIndex(int[] arr,int start, int end){
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
