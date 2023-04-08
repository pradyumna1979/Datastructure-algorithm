package array.AllPairsWithGivenSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class  Method2 {
    public static void printAllPairs(int[] array, int sum) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length-1;
        while(low < high){
            if(array[low]+array[high] == sum){
                System.out.println("( "+array[low]+","+ array[high]+" )");
            }
            if(array[low]+array[high] > sum){
                high--;
            }else{
                low++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, -1, 5};
        int sum = 6;

        printAllPairs(array, sum);
    }

}
