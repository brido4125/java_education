package ch6;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate(" "));
        System.out.println(concatenate("100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));

    }
    static String concatenate(String delim, String... args) {
        String res = "";
        for (String str : args) {
            res += str + delim;
        }
        return res;
    }
    /*
    static String concatenate(String... args) {
        return concatenate("", args);
    }*/
}
