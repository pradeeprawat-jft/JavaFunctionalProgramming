package generic;

class Testing {
    public <T> String getValue(T value, T value2) {
        return value + " " + value2;
    }
}

public class Main {
    public static void main(String[] args) {
        Testing obj = new Testing();
        System.out.println(obj.getValue("pradeep", "rawat"));
    }
}
