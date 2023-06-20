package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class GroupBymethod {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1, 45, "john@example.com"));
        students.add(new Student("Jane", 2, 25, "jane@example.com"));
        students.add(new Student("David", 3, 50, "david@example.com"));
        students.add(new Student("Emma", 4, 40, "emma@example.com"));


        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));

        System.out.println(map);
    }
}
