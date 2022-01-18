package ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호 7자리를 입력하세요(123456-1) : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char genderNum = s.charAt(7);

        switch (genderNum) {
            case '1':
            case '3':
                System.out.println("남성");
                break;
            case '2':
            case '4':
                System.out.println("여성");
                break;
            default:
                System.out.println("유효하지 않은 주민등록 번호입니다.");
        }
    }
}
