package ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자를 하나 입력하세요 : ");
        String input = sc.nextLine();
        ch = input.charAt(0);

        if('0' < ch && ch <='9') {
            System.out.println("입력한 문자는 숫자입니다.");
            System.out.println("ch = " + ch);
        } else if (('a' <= ch && ch <= 'z')) {
            System.out.println("입력한 문자는 소문자입니다.");
            System.out.println("ch = " + ch);
        } else if (('A' <= ch && ch <= 'Z')) {
            System.out.println("입력한 문자는 대문자입니다.");
            System.out.println("ch = " + ch);
        }
    }
}
