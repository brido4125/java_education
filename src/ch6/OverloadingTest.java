package ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 math3 = new MyMath3();
        System.out.println("math3.add(3,3) = " + math3.add(3,3));
        System.out.println("math3.add(3L,3) = " + math3.add(3L,3));
        System.out.println("math3.add(3,3L) = " + math3.add(3,3L));
        System.out.println("math3.add(3L,3L) = " + math3.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("math3.add(a) = " + math3.add(a));
    }
}

class MyMath3{
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }
    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }
    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int res = 0;
        for (int j : a) {
            res += j;
        }
        return res;
    }
}
