package ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        /*
        * 구구단 2단에서 9단까지 출력
        * */
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d \n",i,j,i * j);
            }
        }
    }
}
