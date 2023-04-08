package array;

public class MaximunProductTriplet {
    public static void main(String[] args) {
        int[] arr = {1,-4,3,-6,7,0};
        Triplet<Integer> result = maxProductOfTriplet(arr);
        System.out.println(result);
    }

    private static Triplet<Integer> maxProductOfTriplet(int[] arr) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if(arr[i] > maxB){
                maxC = maxB;
                maxB = arr[i];
            }else if(arr[i] > maxC)
                maxC = arr[i];
            if(arr[i] < minA){
                minB = minA;
                minA = arr[i];
            }else if(arr[i] < minB)
                minB = arr[i];
        }
        return minA*minB*maxA > maxA*maxB*maxC ? new Triplet<>(minA,minB,maxA):new Triplet<>(maxA,maxB,maxA);

    }
}
