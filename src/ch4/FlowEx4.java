package ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s >= 90) {
            grade = 'A';
        } else if (s >= 80) {
            grade = 'B';
        } else if (s >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("grade = " + grade);
    }
}
