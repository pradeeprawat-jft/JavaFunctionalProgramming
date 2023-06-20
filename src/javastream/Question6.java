package javastream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question6 {
    static String[] input = new String[]{"apples", "oranges", "bananas", "grapes", "pears"};

    public static void main(String[] args) {
        List<String> ans = Stream.of(input).filter(str -> (str.endsWith("s") && str.length() > 5)).toList();
        System.out.println(ans);
    }
}
