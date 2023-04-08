package array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveNonDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,1,2,5,5,5,5);

        removeDuplicateJava8(list);

        Integer [] array = {1,2,2,3,4,1,2,5,5,5,5};
        removeDuplicates(array);
    }

    private static void removeDuplicateJava8(List<Integer> list) {
        Set<Integer> set = new HashSet<>();

        Map<Integer,Long> map= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map);
    }

    private static void removeDuplicates(Integer[] array) {
        Arrays.sort(array);
        int counter = 1;
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0; i < array.length-1; i++){
            if(Objects.equals(array[i], array[i+1])){
                map1.put(array[i],++counter );
            }else{
                counter=1;
            }
        }
        System.out.println(map1);
    }
}
