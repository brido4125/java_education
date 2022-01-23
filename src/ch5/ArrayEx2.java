package ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        //int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }
        for (int j : iArr1) {
            System.out.print(j + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println("iArr1 = " + iArr1);
        System.out.println("iArr2 = " + iArr2);
        System.out.println("iArr3 = " + iArr3);
        int i = iArr1.hashCode();//iArra1의 10진수
        System.out.println("i = " + i);
        System.out.println(chArr);
    }
}
