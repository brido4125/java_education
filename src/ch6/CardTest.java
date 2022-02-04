package ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.height = " + Card.height);
        System.out.println("Card.width = " + Card.width);
        /*
        * Set Instance Variable
        * */
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        /*
        * Set Class Variable
        * */
        c1.width = 50;
        c1.height = 150;

        System.out.println("c1.kind = " + c1.kind);
        System.out.println("c1.number = " + c1.number);
        System.out.println("c1.width = " + c1.width);
        System.out.println("c1.height = " + c1.height);
        
        System.out.println("c2.kind = " + c2.kind);
        System.out.println("c2.number = " + c2.number);
        System.out.println("c2.width = " + c2.width);
        System.out.println("c2.height = " + c2.height);
        
    }
}
