package javastream;

import java.util.stream.Stream;

public class Question8 {
    static String[] input = new String[]{"Apple", "Banana", "Orange", "Grapes", "Pear"};

    public static void main(String[] args) {
        System.out.println(Stream.of(input).filter(str -> str.toLowerCase().contains("a")).map(String::toUpperCase).reduce(String::concat).orElse(""));

    }
}
