import java.util.Arrays;
import java.util.Scanner;

public class Edu {
    public static void main(String[] args) {
        int[] ary = {32, 11, 2, 5, 78, 32};
        solution(ary);
    }

    private static  void solution(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[i] > ary[j]) {
                    int tmp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = tmp;
                }
            }
        }
    }
}
