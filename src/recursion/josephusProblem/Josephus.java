package recursion.josephusProblem;

import java.util.Scanner;

/*
Given the total number of persons N and a number k which indicates that k-1 persons are skipped and the kth person is killed in a circle. The task is to choose the person in the initial circle that survives.

Examples:

Input: N = 5 and k = 2
Output: 3
Explanation: Firstly, the person at position 2 is killed,
then the person at position 4 is killed, then the person at position 1 is killed.
Finally, the person at position 5 is killed. So the person at position 3 survives.
*/
public class Josephus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n :");
        int n =scan.nextInt();
        System.out.println("Enter k");
        int k = scan.nextInt();
        int position = jose(n,k);
        System.out.println("position :"+position);
    }
    static int jose(int n, int k){
        if(n==1){
            return 0;
        }
        return (jose(n-1,k)+k)%n;
    }
}
