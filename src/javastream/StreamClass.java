package javastream;

import java.util.Comparator;
import java.util.List;

public class StreamClass {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "Mango", "Banana", "date", "cherry");


        String fruitList = fruits.stream()
                .filter(fruit -> fruit.length() > 3)
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length))
                .reduce((f1, f2) -> f1 + "-" + f2).get();

        System.out.println(fruitList);
    }
}
