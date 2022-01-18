package ch4;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("숫자는 0입니다.");
        }
        else{
            System.out.println("숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d 입니다.\n", i);
        }
    }
}
