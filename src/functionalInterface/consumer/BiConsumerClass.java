package functionalInterface.consumer;


import java.util.function.BiConsumer;

public class BiConsumerClass {
    // no result returned only takes input can take two parameter

    static BiConsumer<Customer, Boolean> consumer = (customer, status) -> System.out.println("Hello " + customer.name + ". Registered Mobile number is " + (status ? customer.mobile : "**********"));

    public static void main(String[] args) {
        String greet = greeting(new Customer("pradeep", "09876543211"));
        System.out.println(greet);
        consumer.accept(new Customer("pradeep", "09876543211"), false);
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
