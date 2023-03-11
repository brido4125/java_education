package generics;

public class Main {
    public static void main(String[] args) {
        ClassName<Long> longClassName = new ClassName<>();
        ClassName<String> stringClassName = new ClassName<>();
        longClassName.setElement(1L);
        stringClassName.setElement("Hello");
        System.out.println(longClassName.getElement());
        System.out.println(stringClassName.getElement());

        LimitClassName<Double> doubleLimitClassName = new LimitClassName<>();
        LimitClassName<Float> floatLimitClassName = new LimitClassName<>();
        doubleLimitClassName.setElement(1.0);
        floatLimitClassName.setElement(1.0f);
        System.out.println(doubleLimitClassName.getElement());
        System.out.println(floatLimitClassName.getElement());

        MultipleClassName<Integer, String> multipleClassName = new MultipleClassName<>();
        multipleClassName.setElement(1);
        multipleClassName.setName("Hello");
        System.out.println(multipleClassName.getElement());
        System.out.println(multipleClassName.getName());
    }
}
