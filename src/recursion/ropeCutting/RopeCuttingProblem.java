package recursion.ropeCutting;

import java.util.Scanner;

/*
Given a rope of length n, you need to find the maximum number of pieces
you can make such that the length of every piece is in set {a, b, c} for
the given three values a, b, c
 */
public class RopeCuttingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rope: ");
        int n = scanner.nextInt();
        System.out.println("Enter length1:");
        int a = scanner.nextInt();
        System.out.println("Enter length2:");
        int b = scanner.nextInt();
        System.out.println("Enter length3:");
        int c = scanner.nextInt();
        int maxPices = ropeCutting(n, a, b, c);
        System.out.println("max pices  : " + maxPices);
    }

    public static int ropeCutting(int ropelenth, int a, int b, int c) {
        if (ropelenth == 0) {
            return 0;
        }
        if (ropelenth < 0) {
            return -1;
        }
        return Math.max(ropeCutting(ropelenth - a, a, b, c),
                Math.max(ropeCutting(ropelenth - b, a, b, c), ropeCutting(ropelenth - c, a, b, c))
        ) + 1;
    }
}
