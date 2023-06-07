package generic;

class Testing {
    public <T, U> String getValue(T value, U value2) {
        return value + " " + value2.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Testing obj = new Testing();
        System.out.println(obj.getValue("pradeep", 23));
    }
}
