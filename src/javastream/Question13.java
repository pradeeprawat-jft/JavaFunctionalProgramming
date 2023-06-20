package javastream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple", 0.75, 15),
                new Product("Grapes", 1.20, 12),
                new Product("Banana", 0.50, 20),
                new Product("Orange", 0.60, 8),
                new Product("Pear", 0.90, 5)
        );
        System.out.println(products.stream().max(Comparator.comparingDouble(Product::getPrice)).map(Product::getName));
    }

}