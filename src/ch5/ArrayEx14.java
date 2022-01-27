package ch5;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            System.out.println("c = " + c);
        }
        char[] chars = src.toCharArray();
        System.out.println(chars);
        System.out.println("chars = " + chars);//주솟값의 hascode의 16진수 출력됨
    }
}
