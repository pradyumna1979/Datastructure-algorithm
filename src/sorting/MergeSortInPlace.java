package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
      int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
      mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr,int s, int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr, int s, int m,int e){
        int[] merge = new int[e-s];
        int i=s,j=m,k=0;
        while(i < m && j < e) {
            if (arr[i] < arr[j]) {
                merge[k++] = arr[i++];
            }
            if (arr[j] < arr[i]) {
                merge[k++] = arr[j++];
            }
        }
        while(i < m){
            merge[k++] = arr[i++];
        }
        while(j < e){
            merge[k++] = arr[j++];
        }
        for(int l=0; l < merge.length; l++){
            arr[s+l] = merge[l];
        }
    }
}
