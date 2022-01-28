package ch5;

import java.util.Arrays;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50},
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d \n", i, j, score[i][j]);
            }
        }
        for (int[] tmp : score) {
            System.out.println("tmp = " + tmp);
            System.out.println(Arrays.toString(tmp));
            for (int element : tmp) {
                System.out.println("element = " + element);
                sum += element;
            }
        }
        System.out.println("sum = " + sum);
    }
}
