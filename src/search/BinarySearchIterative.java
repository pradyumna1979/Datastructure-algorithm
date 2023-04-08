package search;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,11,15,17,21,22};
        int target = 15;
        int index = serchTarget(arr,target);
        System.out.println("index of " + target + " is " +index);
    }
    public static int serchTarget(int[] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length-1;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex-startIndex)/2;
            if(arr[midIndex] == target){
                return midIndex;
            }else if(target > arr[midIndex]){
                startIndex = midIndex+1;
            }else{
                endIndex = midIndex-1;
            }
        }
       return -1;
    }
}
