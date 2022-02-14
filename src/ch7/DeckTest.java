package ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.pick(0);
        System.out.println(card);

        deck.shuffle();
        card = deck.pick(0);
        System.out.println(card);
    }
}

class Deck{
    final int CARD_NUM = 52;// 카드의 개수
    Card[] cards = new Card[CARD_NUM];

    Deck() {
        int i = 0;
        //카드의 무늬와 숫자 설정
        for (int j = Card.KIND_MAX; j > 0; j--) {
            for (int k = 0; k < Card.NUM_MAX; k++) {
                cards[i++] = new Card(j, k + 1);
            }
        }
    }

    Card pick(int index) {
        return cards[index];
    }

    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return cards[index];
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int randomNum = (int) (Math.random() * CARD_NUM);
            Card temp = cards[i];
            cards[i] = cards[randomNum];
            cards[randomNum] = temp;
        }
    }

}

class Card{
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind=" + kind +
                ", number=" + number +
                '}';
    }
}
