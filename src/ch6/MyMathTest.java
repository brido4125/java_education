package ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long res1 = myMath.add(12L, 1L);
        long res2 = myMath.subtract(12L, 1L);
        long res3 = myMath.multiply(12L, 1L);
        double res4 = myMath.divide(12L, 5L);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
    }
}
