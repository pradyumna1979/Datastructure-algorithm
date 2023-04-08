package LargestElement;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,56,8,7,281,7};
        int max = findLargestElement(arr);
        System.out.println("max element : "+max);
    }

    private static int findLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element:arr) {
           if(element>max)
               max = element;
        }
        return max;
    }
}
