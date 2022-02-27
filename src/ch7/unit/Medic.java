package ch7.unit;

public class Medic extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Medic.move");
    }

    @Override
    void stop() {
        System.out.println("Medic.stop");
    }

    void cure() {
        System.out.println("Medic.cure");
    }
}

