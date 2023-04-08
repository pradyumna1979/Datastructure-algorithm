package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MissingNumber1 {
    public static void main(String[] args) {
        int[] arr = { -1,-3 };
        int result = smallestMissingPositive(arr);
        System.out.println(result);
    }
    public static int missingNumber(int[] array){
        OptionalInt max = Arrays.stream(array).max();
        int expected = (max.orElse(0) * (max.orElse(0) + 1))/2;
        int actual = Arrays.stream(array).sum();
        return expected-actual;
    }
    public static int missingNumber1(int[] array){
        int n = array.length;
        int i = 0;
        while(i < n){
            int correctpos = array[i]-1;
            if(array[i] < n && array[i] != array[correctpos])
                swap(array,i,correctpos);
            else
                i++;
        }
        for (int j = 0; j < array.length; j++)
            if(array[j] != j+1)
                return j+1;
        return array.length;

    }
    private static void swap(int[] array, int currentPos, int correctPos){}
    public static int smallestMissingPositive(int[] A) {
        int n = A.length;
        boolean[] seen = new boolean[n+1];
        for (int value : A) {
            if (value > 0 && value <= n) {
                seen[value] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return n + 1;
    }
}
