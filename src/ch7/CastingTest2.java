package ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = null;
        Car car2 = new FireEngine();
        FireEngine fireEngine = null;

        car.drive();
        fireEngine = (FireEngine) car2;
        fireEngine.water();
        car2 = fireEngine; // 자식 타입 => 부모 타입 형변환 생략가능
        car2.drive();
    }
}
