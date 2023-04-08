package recursion.findPowerOfANumber;

import java.util.Scanner;

public class PowerOfNum {
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
        return num*power(num,pow-1);
    }
}
