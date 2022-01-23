package ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int j : score) {
            sum += j;
        }
        average = sum / (float)score.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
