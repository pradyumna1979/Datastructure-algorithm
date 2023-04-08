package GeekForGeeks.reverseArray;

import java.util.Arrays;

public class ReverseTheArray {
    public static void reverseTheArray(int[] array){
        System.out.println(Arrays.toString(array));
        int i = 0;
        int j = array.length-1;
        while(i<j){
            swap(array,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,4,7};
        reverseTheArray(arr);
    }
}
