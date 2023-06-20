package javastream.advancedcollect;

import javastream.Student;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingDouble {

    static List<Student> students = Arrays.asList(
            new Student(1, "Alice", 85, "alice@example.com", 4),
            new Student(2, "Bob", 95, "bob@example.com", 2),
            new Student(3, "Charlie", 90, "charlie@example.com", 3),
            new Student(4, "David", 92, "david@example.com", 1),
            new Student(5, "Emily", 88, "emily@example.com", 5)
    );

    public static void main(String[] args) {
        DoubleSummaryStatistics statistics =  students.stream().collect(Collectors.summarizingDouble(Student::getMarks));

        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getClass());

    }
}
