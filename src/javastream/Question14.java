package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question14 {
    static Integer[] array = new Integer[]{1, 2, 3, 7, 8, 4, 5, 6, 10, 9};

    public static void main(String[] args) {
        System.out.println(

                Stream.of(array).sorted().toList()

        );


        System.out.println(

                Arrays.toString(Stream.of(array).sorted().toArray())

        );

        Stream.of(array).sorted().map(n -> n * n).forEach(System.out::println);


        Map<Boolean, List<Integer>> output = Stream.of(array).collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(output);
    }
}
