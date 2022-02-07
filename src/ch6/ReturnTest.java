package ch6;

import java.util.Arrays;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int res = r.add(3, 5);
        System.out.println(res);

        int[] res2 = {0};
        r.add(3, 5, res2);
        System.out.println(Arrays.toString(res2));
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
