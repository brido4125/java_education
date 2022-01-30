package ch6;

public class TvTest {
    public static void main(String[] args) {
        TV t;
        t = new TV();
        t.channel = 12;
        t.setChannelDown();
        System.out.println("t.channel = " + t.channel);
    }
}
