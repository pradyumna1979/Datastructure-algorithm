package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int hig) {
        if(low >= hig){
            return;
        }
        int s = low;
        int e = hig;
        int mid = s +(e-s)/2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,hig);
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
