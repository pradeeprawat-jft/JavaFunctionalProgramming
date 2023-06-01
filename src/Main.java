import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Pradeep", Gender.MALE),
                new Person("Mukesh", Gender.MALE),
                new Person("Tanya", Gender.FEMALE),
                new Person("Pooja", Gender.FEMALE),
                new Person("Vijay", Gender.MALE),
                new Person("Kajal", Gender.FEMALE)
        );


        System.out.println("Declarative Approach");

        List<Person> females = new ArrayList<Person>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Imperative Approach");
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);

    }


    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
}
