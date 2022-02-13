package ch6;

class Car{
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }
    Car(String color) {
        this.color = color;
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car(Car car) {
        this.color = car.color;
        this.gearType = car.gearType;
        this.door = car.door;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "blue";
        car1.gearType = "auto";
        car1.door = 4;

        Car car2 = new Car("white", "auto", 4);

        System.out.println("car1.toString() = " + car1.toString());
        System.out.println("car2.toString() = " + car2.toString());
    }
}
