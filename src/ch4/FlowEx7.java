package ch4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나의 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("user = " + user);
        System.out.println("com = " + com);
        
        switch (user - com) {
            case 2: case -1:
                System.out.println("유저가 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("유저가 이겼습니다.");
                break;
            default:
                System.out.println("비겼습니다.");
                //break; 마지막 문장이라 break 사용하지 않아도 됩니다.
        }
    }
}
