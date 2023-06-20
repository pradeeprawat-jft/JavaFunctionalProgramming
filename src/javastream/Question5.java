package javastream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question5 {

    static String[] input = new String[]{"Apricot", "Avocado", "Grapes", "Apple", "Banana", "Apricot", "Avocado", "Grapes"};

    public static void main(String[] args) {
        Map<String, Integer> ans = Stream.of(input).collect(Collectors.toSet(
        )).stream().collect(Collectors.toMap(
                str -> str,
                str -> Collections.frequency(List.of(input), str)
        ));
        System.out.println(ans);
    }
}
