package arrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationByReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array : "+Arrays.toString(arr));
        System.out.println("Enter number of position to rotate");
        int position = new Scanner(System.in).nextInt();
        rotateArray(arr, position);
        System.out.println("Rotated array : "+Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int position) {
        if(position < 0)
            position = position + arr.length;
        position = position% arr.length;
        reverse(arr,0,position-1);
        reverse(arr,position, arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    private static void reverse(int[] arr,int low, int high){
        while(low < high) {
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    private static void swap(int[] arr,int low,int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


}
