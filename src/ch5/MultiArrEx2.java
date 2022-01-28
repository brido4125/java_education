package ch5;

import java.util.Scanner;

/*
* Bingo Line Exception Handling
* */
public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingoBoard = new int[SIZE][SIZE];
        Scanner sc = new Scanner(System.in);

        //Array Element init
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingoBoard[i][j] = i * SIZE + j + 1;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingoBoard[i][j];
                bingoBoard[i][j] = bingoBoard[x][y];
                bingoBoard[x][y] = tmp;
            }
        }

        boolean flag = true;
        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingoBoard[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d 사이의 숫자를 입력하세요(종료는 0) : ", SIZE * SIZE);
            num = sc.nextInt();

            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingoBoard[i][j] == num) {
                        bingoBoard[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while (num != 0 && flag);
    }
}
