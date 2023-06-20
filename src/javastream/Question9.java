package javastream;

import java.util.stream.Stream;

public class Question9 {
    static Integer[] input = new Integer[]{3, -2, 5, -7, 8, -4, 10};

    public static void main(String[] args) {
        System.out.println(Stream.of(input).filter(num -> (num > 0)).mapToInt(num -> num).average());
    }
}
