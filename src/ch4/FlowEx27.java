package ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        boolean flag = true;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("합계를 구할 숫자들을 입력하세요(끝내려면 0 입력) : ");

        while (flag) {
            int i = sc.nextInt();
            if (i == 0) {
                flag = false;
            } else {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
