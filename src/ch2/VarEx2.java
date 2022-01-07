package ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 11;
        int tmp = 0;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
