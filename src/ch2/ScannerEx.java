package ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int input1 = sc.nextInt();
        System.out.println("input1 = " + input1);

        System.out.print("정수를 입력하세요 : ");
        String input2 = sc.next();
        System.out.println("input2 = " + input2);
        System.out.println("input2.getClass().getName() = " + input2.getClass().getName());
    }
}
