package ch6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 100;
        System.out.println("d.x = " + d.x);
        change(d);
        System.out.println("After calling change method");
        System.out.println("d.x = " + d.x);
    }

    static void change(Data data) {
        data.x = 1000;
        System.out.print("ReferenceParamEx.change ");
        System.out.println("data.x = " + data.x);
    }
}
