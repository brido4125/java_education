package ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Hong", "Brido", "Daebak"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[i] = " + names[i]);
        }
        String name = names[2];
        System.out.println("name = " + name);
        names[0] = "Song";
        for (String str : names) {
            System.out.println("str = " + str);
        }
    }
}
