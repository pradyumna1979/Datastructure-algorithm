package recursion.findPowerOfANumber;

import java.util.Scanner;

public class PowerOfNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        System.out.println("Enter power : ");
        int pow = scanner.nextByte();
        int res = power(num,pow);
        System.out.println(pow +" power of "+num+ " is "+res);
    }
    private static int power(int num, int pow){
        if(pow == 0)
            return 1;
        if(pow%2 == 0){
            return power(num,pow/2)*power(num,pow/2);
        }
        else {
            return num * power(num, pow - 1);
        }
    }
}
