package ch5;


/*
* counter 배열의 길이 = Random 값의 범위에 해당하는 정수의 갯수
* */
public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[20];
        int[] counter = new int[100];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 100);//0~99
            System.out.print(numArr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 갯수 : " + counter[i]);
        }
    }
}
