package ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("(1) 제곱 연산하기");
            System.out.println("(2) 루트 연산하기");
            System.out.println("(3) 로그 연산하기");
            System.out.print("원하는 메뉴를 선택하세요(종료는 0) : ");

            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("잘못된 입력입니다. 숫자를 다시 입력해주세요.");
                continue;
            }
            System.out.println("선택한 menu는 (" + menu + ")입니다.");
        }
    }
}
