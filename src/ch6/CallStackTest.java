package ch6;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("CallStackTest.main-Start");
        firstMethod();
        System.out.println("CallStackTest.main-End");
    }
    static void firstMethod() {
        System.out.println("CallStackTest.firstMethod-Start");
        secondMethod();
        System.out.println("CallStackTest.firstMethod-End");
    }
    static void secondMethod() {
        System.out.println("CallStackTest.secondMethod-Start");
        System.out.println("CallStackTest.secondMethod-End");
    }
}
