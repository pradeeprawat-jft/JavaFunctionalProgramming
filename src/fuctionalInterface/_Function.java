package fuctionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        Integer number = incrementByOne(1);
        System.out.println(number);
    }

    static Function<Integer,Integer>
    public static Integer incrementByOne(Integer number) {
        return number++;
    }
}
