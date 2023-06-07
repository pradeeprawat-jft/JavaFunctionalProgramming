package functionalInterface.function;

import java.util.function.Function;

public class _Function {
//input and output is there  means takes input and produce output with the business logic
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    //    FunctionalInterface function chaining method
    static Function<Integer, Integer> addByOneAndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);

    public static void main(String[] args) {
        Integer number = incrementByOne(1);
        System.out.println(number);

        Integer number2 = incrementByOneFunction.apply(1);
        System.out.println(number2);

        //function Chaining
        Integer ans = addByOneAndMultiplyBy10.apply(10);
        System.out.println(ans);
    }

    public static Integer incrementByOne(Integer number) {
        return number + 1;
    }
}
