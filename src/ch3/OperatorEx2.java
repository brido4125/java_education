package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("======================");
        i = 5;
        j = 0;

        j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
