package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str = "pradeep";
        Optional.ofNullable(str).ifPresentOrElse(
                (value) -> System.out.println("str have the value " + value),
                () -> System.out.println("User not Found")
        );

        str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            Optional.ofNullable(str).ifPresentOrElse(
                    (value) -> System.out.println("str have the value " + value),
                    NotFoundException::notFound
            );
        }

    }
}
