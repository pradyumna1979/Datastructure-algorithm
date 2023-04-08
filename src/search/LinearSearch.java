package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,11,15,17,21,22};
        int target = 15;
        int index = serchTarget(arr,target);
        System.out.println("index of " + target + " is " +index);
    }

    private static int serchTarget(int[] arr, int target) {
        for(int i=0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
