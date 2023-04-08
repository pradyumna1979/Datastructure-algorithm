package array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  NonRepeatingElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4, 3, 4, 12, 5};
        int n = arr.length;
        int distNo = nonRepeatingElementNLogN(arr, n);
        System.out.println(distNo);
        List<Integer> list = nonRepeatingElementNLogN(arr);
        System.out.println("List :" +list);
    }

    public static int nonRepeatingElement(int[] arr, int n) {

        int result = arr[0];
         for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
    public static int nonRepeatingElementNLogN(int[] arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        int sum1 = 0,sum2=0;
        for(int i=0; i <n; i++){
            if(!map.containsKey(arr[i])){
                sum1 = sum1 + arr[i];
                map.put(arr[i],1)  ;
            }
            sum2 = sum2+arr[i];
        }
        return 2*sum1 - sum2;
    }
    public static List<Integer> nonRepeatingElementNLogN(int[] arr){
       return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream().filter(var-> var.getValue() ==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

