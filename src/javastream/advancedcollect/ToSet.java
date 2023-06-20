package javastream.advancedcollect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSet {
    static Integer[] array = new Integer[]{1, 2, 3, 7, 8, 4, 5, 6, 10, 9};

    public static void main(String[] args) {
        System.out.println(Stream.of(array).collect(Collectors.toSet()));
    }
}
