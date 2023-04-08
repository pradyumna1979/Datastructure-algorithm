package search.squareRootOfANumber;

import java.util.Scanner;
/*
Return flore value if the number is not perfect square
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter the number to find square root : ");
        int num = new Scanner(System.in).nextInt();
        int res= findSquRoot(num);
        System.out.println("result" +res);
    }

    private static int findSquRoot(int num) {

        int low=0,high=num/2;
        while(low <= high){
            int mid = (low+high)/2;

            if(num == mid*mid){
                return mid;
            }else if(num < mid*mid){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return high;
    }
}
