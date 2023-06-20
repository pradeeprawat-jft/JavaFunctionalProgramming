package javastream.advancedcollect;

import javastream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    static List<Student> students = Arrays.asList(
            new Student(1, "Alice", 85, "alice@example.com", 4),
            new Student(2, "Bob", 95, "bob@example.com", 2),
            new Student(3, "Charlie", 90, "charlie@example.com", 3),
            new Student(4, "David", 92, "david@example.com", 1),
            new Student(5, "Emily", 88, "emily@example.com", 5)
    );

    public static void main(String[] args) {
        Map<String, List<Student>> stringListMap = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(stringListMap);


    }
}
