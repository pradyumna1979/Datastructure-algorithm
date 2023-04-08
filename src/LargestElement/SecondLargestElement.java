package LargestElement;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,56,8,7,281,7};
        Pair<Integer,Integer> pair = secondLargestElement(arr);
        System.out.println("second max element : "+ pair);
    }

    private static Pair<Integer,Integer> secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int element:arr) {
           if(element>max) {
               secondMax = max;
               max = element;
           }
        }
        return new Pair<>(max,secondMax);
    }
}
