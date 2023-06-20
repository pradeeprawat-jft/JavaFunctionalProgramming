package javastream;

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, 3500.0, 4),
                new Employee("Bob", 30, 4200.0, 6),
                new Employee("Charlie", 22, 2800.0, 2),
                new Employee("David", 35, 5000.0, 7),
                new Employee("Emily", 27, 3800.0, 5)
        );
        System.out.println(employees.stream().filter(employee -> ((employee.getAge() > 25 && employee.getAge() < 35) && employee.getExperience() > 3)).mapToDouble(Employee::getSalary).average());
    }
}
