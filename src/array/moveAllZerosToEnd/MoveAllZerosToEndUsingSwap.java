package array.moveAllZerosToEnd;

import java.util.Arrays;

public class MoveAllZerosToEndUsingSwap {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,0,3,12};
        System.out.println("Original array : "+ Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After moving zeros the new array : "+ Arrays.toString(arr));
    }

    private static void moveZeros(int[] arr) {
        if(arr.length==1 || arr.length == 0)
            return;
        int nz=0,z=0;
        while(nz < arr.length){
            if(arr[nz] != 0){
                swap(arr,z,nz);
                nz++;
                z++;
            } else{
                nz++;
            }
        }
    }
    private static void swap(int[] arr, int z, int nz){
        int temp = arr[z];
        arr[z] = arr[nz];
        arr[nz] = temp;
    }
}
