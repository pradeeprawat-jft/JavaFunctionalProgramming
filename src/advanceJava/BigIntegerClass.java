package advanceJava;
import java.math.BigInteger;
public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("11");
        BigInteger c = a.add(b);
        System.out.println(c);
    }
}