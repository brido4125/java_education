package ch7.unit;

public class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Marine.move");
    }

    @Override
    void stop() {
        System.out.println("Marine.stop");
    }

    void steamPack() {
        System.out.println("Marine.steamPack");
    }
}
