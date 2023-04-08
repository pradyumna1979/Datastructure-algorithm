package array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,4,8};
        int l=0;
        int r = arr.length;
        //reverse(arr,l,r);
        System.out.println(Arrays.toString(arr));
        reverseRecursive(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int l,int r){
        int temp =0;
        while(l < r){
             temp = arr[l];
            arr[l] = arr[r-1];
            arr[r-1] = temp;
            l++;
            r--;

        }

    }
    public static void reverseRecursive(int[] arr,int l,int r){
        int temp =0;
        if(l>=r) {
            return;
        }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
       reverseRecursive(arr,l+1,r-1);

    }

}

