package javastream;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int experience;

    public Employee(String name, int age, double salary, int experience) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    // Getters and Setters (You can generate them automatically in an IDE)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
