package javastream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Mango", "Banana", "date", "cherry");
        String fruitList = fruits.stream()
                .filter(fruit -> fruit.length() > 3)
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length))
                .reduce((f1, f2) -> f1 + "-" + f2).get();
        System.out.println(fruitList);

        List<Student> students = new ArrayList<>();
        students.add(new Student("pradeep", "pradeep", 40));
        students.add(new Student("mukesh", "pradeep", 50));
        students.add(new Student("mukesh", "pradeep", 50));
        students.add(new Student("rajkumar", "pradeep", 90));
        students.add(new Student("vivak", "pradeep", 10));
        students.add(new Student("vivak", "pradeep", 10));
        students.add(new Student("vijay", "pradeep", 70));

        List<String> stringList = students.stream().filter(student -> student.marks>=0).map(student -> student.name).toList();
        System.out.println(stringList);
    }
}
