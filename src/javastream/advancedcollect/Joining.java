package javastream.advancedcollect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {
    static Integer[] array = new Integer[]{1, 2, 3, 7, 8, 4, 5, 6, 10, 9};

    public static void main(String[] args) {
    String str =  Stream.of(array).map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
