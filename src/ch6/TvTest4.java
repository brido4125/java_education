package ch6;

public class TvTest4 {
    public static void main(String[] args) {
        TV[] tvs = new TV[3];

        for (int i = 0; i < tvs.length; i++) {
            tvs[i] = new TV();
            tvs[i].channel = i + 5;
        }
        for (TV tv:tvs) {
            System.out.println("tv.channel = " + tv.channel);
        }
    }
}
