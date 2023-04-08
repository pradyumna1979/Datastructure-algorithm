package sorting;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {2,4,7,19,11,12,17};
        boolean isSorted = isSorted(arr);
        System.out.println(isSorted);
    }
    private static  boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
