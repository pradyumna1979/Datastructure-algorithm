package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctElementsOfAnArray {
    public static void main(String[] args) {
        int[] arr = {12,10,9,45,2,10,10,45};
        int n = arr.length;
        removeDuplicatesUsingSorting(arr,n);
    }
    public static void removeDuplicates(int[] arr, int n){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i < n; i++){
            if(set.add(arr[i]))
                System.out.println(arr[i]);
        }
    }
    public static void removeDuplicatesUsingSorting(int[] arr, int n){
        //{12,10,9,45,2,10,10,45};
        //2,9,10,10,10,12,45,45
        Arrays.sort(arr);
        for(int i=0; i < n-1; i++){
             while (i < n-1 && arr[i] == arr[i+1]){
                i++;
             }
            System.out.println(arr[i] + " ");
        }
    }
}
