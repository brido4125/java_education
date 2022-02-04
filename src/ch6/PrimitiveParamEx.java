package ch6;
class Data{
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 100;
        System.out.println("d.x = " + d.x);
        change(d.x);
        System.out.println("After calling change method");
        System.out.println("d.x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.print("PrimitiveParamEx.change() ");
        System.out.println("x = " + x);
    }
}
