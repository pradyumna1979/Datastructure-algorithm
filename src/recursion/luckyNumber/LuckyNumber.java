package recursion.luckyNumber;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter counter: ");
        int counter = scanner.nextInt();

        boolean luckyNum = isLuckyNumber(n,counter);
        System.out.println("Is "+n+" lucky number: " +luckyNum);
    }

    private static boolean isLuckyNumber(int n, int counter) {
        if(n%counter==0)
            return false;
        if(n < counter)
            return true;
        return isLuckyNumber(n-n/counter,counter+1);
    }
}
