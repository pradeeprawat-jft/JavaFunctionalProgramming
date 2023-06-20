package javastream;

import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple", 0.75, 15),
                new Product("Banana", 0.50, 20),
                new Product("Orange", 0.60, 8),
                new Product("Grapes", 1.20, 12),
                new Product("Pear", 0.90, 5)
        );


        System.out.println(products.stream().filter(product -> (product.getQuantity() > 10 && product.getPrice() < 1.00)).mapToDouble(Product::getPrice).sum());

    }
}
