package javastream;

import java.util.*;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1, 45, "john@example.com"));
        students.add(new Student("Jane", 2, 25, "jane@example.com"));
        students.add(new Student("David", 3, 50, "david@example.com"));
        students.add(new Student("Emma", 4, 40, "emma@example.com"));

        System.out.println(students);
        Collections.reverse(students);
        System.out.println(students);

        Map<String, Integer> studentMarks = students.stream().filter(student -> student.marks > 25).collect(Collectors.toMap(
                student -> student.name,
                student -> student.marks
        ));
        System.out.println(studentMarks);
    }


}
