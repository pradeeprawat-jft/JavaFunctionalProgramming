package advanceJava;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        fibo(a);
    }
   static void fibo(int num)
   {
       BigInteger a = new BigInteger("0");
       BigInteger b = new BigInteger("1");
       BigInteger c = new BigInteger("1");

       for (int i = 2 ;i <= num ;i++)
       {
           c = a.add(b);
           a = b;
           b = c;
       }
       System.out.println(b);
   }
}
