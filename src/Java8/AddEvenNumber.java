package Java8;

import java.util.Scanner;
import java.util.stream.Stream;

public class AddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of even numbers to print :n:");
        int n = new Scanner(System.in).nextInt();
        int sum =Stream.iterate(2, p->p+2)
                .limit(n)
                .mapToInt(value -> value)
                .sum();

        System.out.println("sum ::::::::::: "+sum);
    }
}
