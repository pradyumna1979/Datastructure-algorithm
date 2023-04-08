package search.medianOfTwoShortedArrays;

import java.util.Arrays;

public class MedianOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1,3,8,17};
        System.out.println("arr1 : "+Arrays.toString(arr1));
        int[] arr2 = {5,6,7,19,21,25,27};
        System.out.println("arr2 : "+Arrays.toString(arr2));
        int[] merged = mergeTwoArrays(arr1,arr2);
        System.out.println("merged : "+Arrays.toString(merged));
        float median= merged.length%2==0?merged[merged.length/2] : (float)(merged[merged.length/2]+merged[merged.length/2+1])/2;
        System.out.println("median : "+median);
    }
    public static int[] mergeTwoArrays(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length+ arr2.length];
        int i = 0,j=0,k=0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i]== arr2[j]){
                merged[k++]=arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                merged[k++]= arr1[i];
                i++;
            }else{
                merged[k++]=arr2[j];
                j++;
            }
        }
        while(i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while(j < arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
