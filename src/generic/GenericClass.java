package generic;
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("John Doe", 30);
        String name = person.getFirst();
        Integer age = person.getSecond();
        System.out.println("Name: " + name + ", Age: " + age);

        Pair<Double, Integer> num = new Pair<>(2.3, 30);
        Double num1 = num.getFirst();
        Integer num2 = num.getSecond();
        System.out.println("double: " + num1 + ", integer: " + num2);
    }
}
