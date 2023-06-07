package functionalInterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateClass {

    static BiPredicate<Integer, String> isLengthMatch = (num, str) -> str.length() == num;


    public static void main(String[] args) {
        boolean result = isLengthMatch.test(5, "Hello");
        System.out.println(result);  // Output: true

        result = isLengthMatch.test(5, "HelloWorld");
        System.out.println(result);  // Output: false
    }
}
