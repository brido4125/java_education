package ch7;

class FinalCard{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    public FinalCard(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    public FinalCard() {
        this(1, "HEART");
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        FinalCard finalCard = new FinalCard(10,"SPADE");
        System.out.println("finalCard = " + finalCard.toString());
        FinalCard defaultCard = new FinalCard();
        System.out.println("defaultCard.toString() = " + defaultCard.toString());
    }
}
