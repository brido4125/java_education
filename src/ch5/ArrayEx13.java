package ch5;

import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("16 진수를 입력하세요 : ");
        String string = sc.next().toUpperCase();
        char[] hex = string.toCharArray();
        String res = "";

        if (hex[0] == '0' && hex[1] == 'X') {
            res = hexToBinary(2, hex);
        }else{
            res = hexToBinary(0, hex);
        }
        System.out.println("16진수 : " + new String(hex));
        System.out.println("Converting to Binary result = " + res);
    }

    static String hexToBinary(int startIndex,char[] hex) {
        /*
         * 0 to 16까지 Binary value
         * */
        String[] binary = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111",
        };

        String res = "";

        for (int i = startIndex; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                res += binary[hex[i] - '0'];
            } else {
                res += binary[hex[i] - 'A' + 10];
            }
        }
        return res;
    }
}
