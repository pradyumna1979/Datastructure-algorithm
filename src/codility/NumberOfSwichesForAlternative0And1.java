package codility;

import java.util.Arrays;

public class NumberOfSwichesForAlternative0And1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(Arrays.toString(arr));
        int result =numberOfSwiches(arr);
        System.out.println("number of swich : "+result);
    }


    private static int numberOfSwiches(int[] arr) {
        int count = 0;
        int previous = arr[arr.length-1];
        for(int i= arr.length-2; i >= 0; i--){
            if(arr[i]==previous){
                 count = count+1;
            }
            previous = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
}
