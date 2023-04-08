package array.primeNumber;
/*
O(n) time complexity
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int num=9;
        boolean isPrime = isPrimeNum(num);
        System.out.println(num+" is prime "+isPrime);
    }

    private static boolean isPrimeNum(int num) {
        for(int i=2; i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
