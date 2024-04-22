package src.base.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public CollectionExercise() {
    }

    public static void main(String[] args) {
        List objects = new ArrayList();
        objects.add(new Dog("小黑", 8));
        objects.add(new Dog("小黄", 100));
        objects.add(new Dog("小丁", 23));
        Iterator iterator = objects.iterator();

        Object next;
        while(iterator.hasNext()) {
            next = iterator.next();
            System.out.println(next);
        }

        iterator = objects.iterator();

        while(iterator.hasNext()) {
            next = iterator.next();
            System.out.println(next);
        }

    }
}
