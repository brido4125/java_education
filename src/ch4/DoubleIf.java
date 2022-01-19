package ch4;

public class DoubleIf {
    public static void main(String[] args) {
        int x = 12;
        if (x > 0) {
            System.out.println("IF - satisfied");
        } else if (x > 5) {
            System.out.println("Else If - satisfied");
        }
        if (x > 5) {
            System.out.println("IF - satisfied");
        }
    }
}
