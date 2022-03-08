package baseball;

import java.util.Scanner;


/**
 * 스트라이크 : 예를 들어 십의자리의 위치와 숫자가 모두 동일한 경우
 */


public class GameApplication {
    public static void main(String[] args) {
        String input = input();
        String answer = "test";
        while (!input.equals(answer)) {
            input = input();
        }
    }

    private static String input() {
        System.out.print("정답을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
