package Java8.training;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorials {
    public static void main(String[] args) {
        int bigInteger = factorial(21);
        System.out.println(bigInteger);
    }
    public static BigInteger factorial(long n){
        return LongStream.rangeClosed(1,21)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE,BigInteger::multiply);
    }
    public static int factorial(int n){
       return IntStream.rangeClosed(1,n)
                .reduce(1, (a,b)-> a*b);
    }
}
