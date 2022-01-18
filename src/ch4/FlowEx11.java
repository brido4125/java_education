package ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요(123456-1234567) : ");

        Scanner sc = new Scanner(System.in);
        String regNum = sc.nextLine();
        char genderNum = regNum.charAt(7);

        switch (genderNum) {
            case '1': case '3':
                switch (genderNum) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                        break;
                }
            break;
            case '2': case '4':
                switch (genderNum) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                        break;
                }
            break;
            default:
                System.out.println("유효하지 않은 주민번호 입니다.");
        }
    }
}
