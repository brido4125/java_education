package ch5;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[6];

        for (int i = 0; i < ball.length ; i++) {
            int random = (int) (Math.random() * 45) + 1;
            ball[i] = random;
        }
        System.out.println(Arrays.toString(ball));
    }
}
