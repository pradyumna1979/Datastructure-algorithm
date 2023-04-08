package search.CeilAndFloorValue;

import java.util.Scanner;
/*
The ceil function and the floor function have different definitions.
The ceil function returns the smallest integer value which is greater than or equal to the specified number,
whereas the floor function returns the largest integer value which is
less than or equal to the specified number.
int[] arr = {19,23,56,61,72,88,92};
 */
public class CeilAndFloorValue {
    public static void main(String[] args) {
        int[] arr = {19,23,56,61,72,88,92};
        System.out.println("Enter target : ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int ceil = ceil(arr,target,0,arr.length-1);
        System.out.println("ceil value of "+target+" : "+ceil);
        int floor = floor(arr,target,0,arr.length-1);
        System.out.println("floor value of "+target+" : "+floor);

    }
    public static int ceil(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target > arr[mid]) {
                start=mid+1;
            }else{
                end = mid -1;
            }
        }
        return arr[start];
    }
    public static int floor(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target > arr[mid]) {
                start=mid+1;
            }else{
                end = mid -1;
            }
        }
        return arr[end];
    }
}
