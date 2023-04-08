package array;

import java.util.Arrays;

public class  MoveAllZerosToTheEndOfTheArray {
    public static void main(String[] args) {
         int[] arr = {0,1,2,0,0};
         moveAllZerosToRight(arr, arr.length);
    }
    public static void moveAllZerosToRight(int[] arr, int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < n){
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
