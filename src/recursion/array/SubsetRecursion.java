package recursion.array;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class SubsetRecursion {

    public static void findPowerSet(int []s, Deque<Integer> res, int n){
       // res.stream().reduce(0,(a,b)->a+b);
        if (n == 0){
            System.out.println(res);
            System.out.println();
            /*if(res.stream().reduce(0,(a,b)->a+b) ==5){
                System.out.println(res.stream().reduce(0,(a,b)->a+b) ==5);
                System.exit(1);
            }*/
            return;
        }
        res.addLast(s[n - 1]);
        findPowerSet(s, res, n - 1);
        res.removeLast();
        findPowerSet(s, res, n - 1);
    }

    public static void main(String[] args)
    {
        int []set = {1,2,3};
        Deque<Integer> res = new ArrayDeque<>();
        findPowerSet(set, res, set.length);
    }
}

