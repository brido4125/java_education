package ch7;

class Singleton{
    private static final Singleton singleton = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return singleton;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
    }
}
