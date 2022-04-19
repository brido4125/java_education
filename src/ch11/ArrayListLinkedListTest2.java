package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(100000);
        LinkedList ll = new LinkedList();


        System.out.println("순차 추가 Test");
        System.out.println("ArrayList : " + add(al));
        System.out.println("LinkedList : " + add(ll));

        System.out.println("접근 시간 Test");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));

        System.out.println("중간 삭제 Test");
        System.out.println("ArrayList : " + delete(al));
        System.out.println("LinkedList : " + delete(ll));
    }

    //순차적으로 추가
    public static long add(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long delete(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
