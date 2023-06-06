package predicate;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isValidMobileNumber = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = number -> number.contains("3");

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("07123456789"));
        System.out.println(isValidPhoneNumber("09876543222"));
        System.out.println(isValidPhoneNumber("98765432234"));
        System.out.println(isValidMobileNumber.test("07987654321"));

//method chaining
        System.out.println(isValidMobileNumber.and(containsNumber3).test("07128596789"));
    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }


}
