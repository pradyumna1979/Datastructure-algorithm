package array.moveAllZerosToEnd;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println("Original array : "+ Arrays.toString(arr));
        moveZers(arr);
        System.out.println("After moving zeros the new array : "+ Arrays.toString(arr));
    }

    private static void moveZers(int[] arr) {
        if(arr.length==1 || arr.length == 0)
            return;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[k++]=0;
        }
    }
}
