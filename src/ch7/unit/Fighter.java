package ch7.unit;

public class Fighter extends Unit implements FightAble {
    @Override
    public void attack(Unit unit) {
        System.out.println("Fighter.attack");
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    void stop() {
        System.out.println("Fighter.stop");
    }
}
