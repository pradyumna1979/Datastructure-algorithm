package array;

public class MaximunProductOfTriplet {
    public static void main(String[] args) {
        int[] arr = {1,-4,3,-6,7,0};
        int maxProduct = maxProductOfTriplet(arr);
        System.out.println(maxProduct);
    }

    private static int maxProductOfTriplet(int[] arr) {
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
            } else if (arr[i] > maxB){
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
        return Math.max(minA*minB*maxA,maxA*maxB*maxC);

    }
}
