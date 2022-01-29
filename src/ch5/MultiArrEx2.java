package ch5;

import java.util.Scanner;

/*
* Bingo Line Exception Handling
* */
public class MultiArrEx2 {
    static final int SIZE = 5;
    public static void main(String[] args) {
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
            printBingo(bingoBoard);

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
            //validation check!
            flag = checkBingo(bingoBoard);
        } while (num != 0 && flag);
        printBingo(bingoBoard);
        System.out.println("Solve the Bingo!");
    }

    private static void printBingo(int[][] bingoBoard) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2d ", bingoBoard[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean checkBingo(int[][] bingoBoard) {
        boolean flag = true;
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < bingoBoard.length; i++) {
            for (int j = 0; j < bingoBoard[i].length; j++) {
                countX += bingoBoard[i][j];
                countY += bingoBoard[j][i];
            }
            if (countX == 0 || countY == 0) {
                flag = false;
            }
        }
        return flag;
    }

}
