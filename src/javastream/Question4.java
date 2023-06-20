package javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question4 {
    static Integer[] input = new Integer[]{5, 12, 8, 17, 20, 6};

    

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 8, 17, 20, 6));
        list.remove(5);
        System.out.println(Stream.of(input).filter(num -> (num > 10 && num % 2 == 0)).reduce(0, Integer::sum));
    }
}
