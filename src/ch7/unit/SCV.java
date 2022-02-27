package ch7.unit;

public class SCV extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("SCV.move");
    }

    @Override
    void stop() {
        System.out.println("SCV.stop");
    }

    void getMineral() {
        System.out.println("SCV.getMineral");
    }
}
