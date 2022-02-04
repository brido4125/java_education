package ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("1과 100 사이의 정수를 입력하시오 : ");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("Down");
            } else if (input < answer) {
                System.out.println("Up");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
