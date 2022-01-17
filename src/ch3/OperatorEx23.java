package ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "hong"; // String internal => String Pool에 "hong" 저장한다.
        String s2 = "hong";
        String s3 = new String("hong"); // Heap 영역에 저장

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.printf("s1 == s2의 비교 결과 : %b" , s1 == s2);
        System.out.println();
        System.out.printf("s1 == s3의 비교 결과 : %b" , s1 == s3);

        System.out.println();

        //String 문자열 동일하면 hashCode()는 동일 => String Class Overriding
        System.out.println();
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());

        System.out.println();
        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3) = " + System.identityHashCode(s3));

        String intern = s3.intern();
        System.out.println();
        System.out.println("===============intern() 비교=================");

        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3) = " + System.identityHashCode(s3));
        System.out.println("System.identityHashCode(intern) = " + System.identityHashCode(intern));

        System.out.printf("s1 == intern 비교 결과 : %b", s1 == intern);
    }
}
