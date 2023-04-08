package Java8.mainClass;

import java.util.function.Predicate;

public class NumberIsEvenOrOdd {
    public static void main(String[] args) {
        isEven(4, " is Even ", e-> e%2 == 0);
    }
    public static void isEven(int num, String msg, Predicate<Integer> predicate){
        System.out.printf("num "+num +  msg + predicate.test(num));
    }
}
