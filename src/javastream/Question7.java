package javastream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question7 {
    static Integer[] input = new Integer[]{5, 12, 8, 170, 20, 6};

    public static void main(String[] args) {
        System.out.println(Stream.of(input).reduce(Integer::max));
    }
}
