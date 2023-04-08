package subArray.zeroSumSubArray;

import java.util.*;

public class ZeroSumPart2 {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, -1, 0, 4};
        int[] arr1={-3, 2, 3, 1, 6};
        ArrayList<Pair<Integer,Integer>> subArrays = findSubArrays(arr);
        System.out.println(subArrays);
        printSubArray(subArrays,arr);
    }

    private static void printSubArray(ArrayList<Pair<Integer, Integer>> subArrays, int[] arr) {
        for (Pair pair:subArrays ) {
            for(int i=(int)pair.getFirst();i<=(int)pair.getSecond();i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Pair<Integer, Integer>> findSubArrays(int[] arr) {
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        int sum = 0;
        ArrayList<Pair<Integer,Integer>> out = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0)
                out.add(new Pair<>(0, i));
            List<Integer> al = new ArrayList<>();
            if(map.containsKey(sum)){
                al = map.get(sum);
                for (Integer integer : al) {
                    out.add(new Pair<>(integer + 1, i));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        System.out.println(map);
        return out;
    }

    private static boolean isZeroSum(int[] arr) {
        int prefixSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if(prefixSum ==0 || arr[i] == 0 || set.contains(prefixSum)){
                return true;
            }
            set.add(prefixSum);
        }
        return  false;
    }
}
