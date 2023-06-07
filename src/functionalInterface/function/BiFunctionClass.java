package functionalInterface.function;;

import java.util.function.BiFunction;

public class BiFunctionClass {
//input and output is there  means takes input and produce output with the business logic


    //    FunctionalInterface function chaining method
    static BiFunction<Integer, Integer, Integer> addByOneAndMultiplyBy10 = (number1, number2) -> number1 * number2;

    public static void main(String[] args) {
        Integer ans = addByOneAndMultiplyBy10.apply(10, 10);
        System.out.println(ans);
    }

    public static Integer incrementByOne(Integer number) {
        return number + 1;
    }
}
