package ch3;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int res1 = a * a / a;
        int res2 = a / a * a;

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
