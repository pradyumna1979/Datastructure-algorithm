package array.CountOfPairsWithGivenPairs;

import java.util.HashMap;
import java.util.Map;

public class Method2 {
    public static int printAllPairs(int[] array, int sum) {
        int count = 0;
        int n = array.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int b = sum - array[i];
            if (map.containsKey(b)) {
                count = count + map.get(b);
                map.put(b, map.get(b) + 1);
            }else {
                map.put(array[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,5,7,-1};
        //int[] array = {1, 1, 1, 1}; 
        int sum = 6;
        //int sum = 2;
        int count = printAllPairs(array, sum);
        System.out.println(count);
    }

}
