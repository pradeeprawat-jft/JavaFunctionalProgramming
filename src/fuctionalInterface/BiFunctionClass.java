package fuctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionClass {


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
