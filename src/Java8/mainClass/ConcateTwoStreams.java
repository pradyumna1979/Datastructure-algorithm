package Java8.mainClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoStreams {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);
        Stream<Integer> stream1 = integerList1.stream();
        Stream<Integer> stream2 = integerList2.stream();
        Stream.concat(stream1,stream2).forEach(System.out::println);

    }

}
