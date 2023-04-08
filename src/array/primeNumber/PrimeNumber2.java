package array.primeNumber;
/*
O(rootN) time Complexity
* */
public class PrimeNumber2 {
    public static void main(String[] args) {
        int num=9;
        boolean isPrime = isPrimeNum(num);
        System.out.println(num+" is prime "+isPrime);
    }

    private static boolean isPrimeNum(int num) {
        if(num==1){
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }

        for(int i=4; i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
