package javastream;

public class Student {
    Integer id;
    String name;
    Integer marks;
    String email;

    Integer rank;

    public Student(String name, String email, Integer marks) {
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public Student(String name, Integer id, Integer marks, String email) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Student(Integer id, String name, Integer marks, String email, Integer rank) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.email = email;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", email='" + email + '\'' +
                '}';
    }

}
