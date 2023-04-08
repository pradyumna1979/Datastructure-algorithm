package LargestElement;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,56,8,7,281,7};
        Triplet<Integer,Integer,Integer> triplet = secondLargestElement(arr);
        System.out.println("second max element : "+ triplet);
    }

    private static Triplet<Integer,Integer,Integer> secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int element:arr) {
           if(element>max) {
               thirdMax = secondMax;
               secondMax = max;
               max = element;
           }else if (element > secondMax) {
                thirdMax=secondMax;
                secondMax=element;
            }else if (element > thirdMax)
                thirdMax=element;
        }
        return new Triplet<>(max,secondMax,thirdMax);
    }
}
