package ch12;

import java.util.ArrayList;

class Fruit{
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit{
    public String toString() {
        return "Grape";
    }
}

class Toy{
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();

        fruitBox.add(new Fruit());
    }
}


class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    int size() { return list.size(); }
    T get(int i) { return list.get(i); }
    public String toString() { return list.toString();}
}