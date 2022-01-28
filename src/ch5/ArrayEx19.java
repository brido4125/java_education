package ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50},
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("==============================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            double avg = 0.0;

            korTotal += score[i][0];
            engTotal += score[i][0];
            mathTotal += score[i][0];
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            avg = sum / (double) score[i].length;
            System.out.printf("%5d %5.1f\n",sum,avg);
        }
        System.out.println("==============================");
        System.out.printf("총점 : %3d %4d %4d \n", korTotal, engTotal, mathTotal);
    }
}
