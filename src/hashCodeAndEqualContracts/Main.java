package hashCodeAndEqualContracts;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Pen {
    int price;
    String color;

    public Pen(Integer price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen pen)) return false;
        return Objects.equals(getPrice(), pen.getPrice()) && Objects.equals(getColor(), pen.getColor());
    }

    @Override
    public int hashCode() {
        return 31 * (this.getPrice().hashCode() + this.getPrice().hashCode());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {

        Pen pen1 = new Pen(10, "blue");
        Pen pen2 = new Pen(10, "red");

        Set<Pen> set = new HashSet<>();
        set.add(pen1);
        set.add(pen2);
        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
        System.out.println(pen1.equals(pen2));
        System.out.println(set);
    }

}