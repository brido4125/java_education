package ch6;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1.toString() = " + c1.toString());
        System.out.println("c2.toString() = " + c2.toString());
    }
}
