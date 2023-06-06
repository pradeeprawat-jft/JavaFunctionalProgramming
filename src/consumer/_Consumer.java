package consumer;

import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> getConsumer = customer -> System.out.println("Hello " + customer.name + ". Registered Mobile number is " + customer.mobile);

    public static void main(String[] args) {
        String greet = greeting(new Customer("pradeep", "09876543211"));
        System.out.println(greet);
        getConsumer.accept(new Customer("pradeep", "09876543211"));


    }

    public static String greeting(Customer customer) {
        return "Hello " + customer.name + ". Registered Mobile number is " + customer.mobile;
    }

    static class Customer {
        private final String name;
        private final String mobile;

        Customer(String name, String mobile) {
            this.name = name;
            this.mobile = mobile;
        }
    }
}
