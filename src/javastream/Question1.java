package javastream;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1, 45, "john@example.com"));
        students.add(new Student("Jane", 2, 25, "jane@example.com"));
        students.add(new Student("David", 3, 50, "david@example.com"));
        students.add(new Student("Emma", 4, 40, "emma@example.com"));


        List<Integer> studentMarks = students.stream().filter(student -> student.marks > 25).map(student -> student.marks).toList();
        System.out.println(studentMarks);
    }


}
