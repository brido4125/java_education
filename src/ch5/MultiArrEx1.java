package ch5;

import java.util.Scanner;

/*
* homework : 이미 입력한 숫자는 다시 입력 하지 않도록!
* */
public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = new byte[SIZE-1][SIZE-1];
        setShipBoard(shipBoard);
        //printBoard(shipBoard);
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("좌표를 입력하세요(00은 종료) : ");
            String s = sc.nextLine();
            if (s.length() == 2) {
                x = s.charAt(0) - '0';
                y = s.charAt(1) - '0';
                if (x == 0 && y == 0) {
                    break;
                }
            }
            if (s.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                continue;
            }
            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
            printBoard(board);
        }
    }

    static private void setShipBoard(byte[][] shipBoard) {
        for (int i = 0; i < shipBoard.length; i++) {
            for (int j = 0; j < shipBoard[i].length; j++) {
                shipBoard[i][j] = (byte)(Math.random() * 2);
            }
        }
    }

    static private void printBoard(byte[][] shipBoard) {
        for (int i = 0; i < shipBoard.length; i++) {
            for (int j = 0; j < shipBoard[i].length; j++) {
                System.out.print(shipBoard[i][j]);
            }
            System.out.println();
        }
    }
    static private void printBoard(char[][] shipBoard) {
        for (int i = 0; i < shipBoard.length; i++) {
            for (int j = 0; j < shipBoard[i].length; j++) {
                System.out.print(shipBoard[i][j]);
            }
            System.out.println();
        }
    }
}
