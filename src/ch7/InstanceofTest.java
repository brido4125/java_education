package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        if (fe instanceof FireEngine) {
            System.out.println("fe is instanceof FireEngine");
        }
        if (fe instanceof Car) {
            System.out.println("fe is instanceof Car");
        }
        if (fe instanceof Object) {
            System.out.println("fe is instanceof Object");
        }
        System.out.println("fe.getClass().getName() = " + fe.getClass().getName());
    }
}
