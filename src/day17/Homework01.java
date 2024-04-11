package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework01 {
    public Homework01() {
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            list.add("hello" + i);
        }

        System.out.println(list);
        list.add(1, "hsp");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        list.set(6, "hhhh");
        System.out.println(list);
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
