package array;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import static java.util.Arrays.stream;

public class MaxAndMeanElement {
    public static void main(String[] args) {
        int[] array = {1,23,4,45,6,74,55};
        int length = array.length;
        int maxElement = maxElement(array,length);
       // System.out.println("Max element = "+maxElement);
        int minElement = minElement(array,length);
       // System.out.println("Min element = "+minElement);
        max(array);
    }
    public static int maxElement(int[] array, int length){
        int maxElement = 0;
        for(int i=0; i< length; i++){
            if(maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    public static void max(int[] array){
       OptionalInt max = stream(array)
                .max();
        System.out.println(max.orElse(0));
    }
    public static int minElement(int[] array, int length){
        int minElement = array[0];
        for(int i=1; i< length; i++){
            if(minElement > array[i]) {
                minElement = array[i];
            }
        }
        return minElement;
    }
}
