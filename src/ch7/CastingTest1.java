package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fireEngine = new FireEngine();
        FireEngine fireEngine1 = null;

        car = fireEngine;//자식 -> 부모 Casting, 생략 가능
        fireEngine1 = (FireEngine) new Car();//부모 -> 자식 Casting
        fireEngine1.water();
    }
}
class Car{
    String color;
    int door;

    void drive() {
        System.out.println("Car.drive");
    }

    void stop() {
        System.out.println("Car.stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("FireEngine.water");
    }
}
