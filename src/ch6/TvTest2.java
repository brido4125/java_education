package ch6;

public class TvTest2 {
    public static void main(String[] args) {
        TV t1 = new TV();
        TV t2 = new TV();
        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);

        t1.channel = 7;

        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);
    }
}
