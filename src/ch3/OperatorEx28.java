package ch3;

public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0xF;
        System.out.printf("x = %#X \t\t\t%s \n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t\t%s \n", x, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X \t%s \n", x,y,x | y, toBinaryString(x|y));
        System.out.printf("%#X & %#X = %#X \t%s \n", x,y,x & y, toBinaryString(x&y));
        System.out.printf("%#X ^ %#X = %#X \t%s \n", x,y,x ^ y, toBinaryString(x^y));
    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}
