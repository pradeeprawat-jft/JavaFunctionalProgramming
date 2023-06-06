package lambda;

public class LambdaExpression {

    public static void main(String[] args) {
        SumInterface sum = (a, b) -> a + b;

        System.out.println(sum.sum(2, 6));

        SumInterface obj = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println(obj.sum(2, 6));
    }


}
