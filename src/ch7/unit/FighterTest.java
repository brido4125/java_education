package ch7.unit;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        System.out.println(fighter instanceof Unit);
        System.out.println(fighter instanceof FightAble);
        System.out.println(fighter instanceof Movable);
        System.out.println(fighter instanceof FightAble);
        System.out.println(fighter instanceof Object);
    }
}
