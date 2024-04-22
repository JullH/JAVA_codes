package src.base.day18;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public LinkedHashSet01() {
    }

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥托", 1000.0));
        linkedHashSet.add(new Car("奥迪", 300000.0));
        linkedHashSet.add(new Car("法拉利", 1.0E7));
        linkedHashSet.add(new Car("奥迪", 300000.0));
        linkedHashSet.add(new Car("保时捷", 7.0E8));
        linkedHashSet.add(new Car("奥迪", 300000.0));
        System.out.println(linkedHashSet);
    }
}
