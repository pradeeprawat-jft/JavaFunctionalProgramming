package custructorReference;

public class Main {
    public static void main(String[] args) {
        FunInterface funInterface = Student::new;
        funInterface.greet(new Helper("pradeep", "pradeep@gmail.com"));
    }
}
