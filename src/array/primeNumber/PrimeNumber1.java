package array.primeNumber;
/*
O(rootN) time Complexity
* */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int num=25;
        boolean isPrime = isPrimeNum(num);
        System.out.println(num+" is prime "+isPrime);
    }
/*
01  02  03  04  05 06
07  08  09  10  11 12
13  14  15  16  17 18
19  20  21  22  23 24
25  26  27  28  29 30
31  32  33  34  35 36
*/
    private static boolean isPrimeNum(int num) {
        if(num==1){
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num%2 == 0 || num%3 ==0) {
            return false;
        }
        for(int i=5; i<=Math.sqrt(num);i=i+6){
            if(num%i == 0 || num%(i+2) ==0){
                return false;
            }
        }
        return true;
    }
}
