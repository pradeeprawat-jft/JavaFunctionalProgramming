package javastream.advancedcollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ToCollection {
    static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 8, 4, 5, 6, 10, 9));

    public static void main(String[] args) {
        Vector<Integer> l = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toCollection(Vector::new));
        System.out.println(l);
    }
}
