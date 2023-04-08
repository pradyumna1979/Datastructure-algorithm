package array.majorityElement;
/*
Find the majority element in the array.
A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajority(arr);
        System.out.println("Majority element : "+majorityElement);
    }

    private static int findMajority(int[] arr) {
        int majority = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(majority==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                majority=arr[i];
                count=1;
            }
        }
        return majority;
    }
}
