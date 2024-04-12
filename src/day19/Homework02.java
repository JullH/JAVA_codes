package src.day19;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public Homework02() {
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car BMW = new Car("宝马", 400000.0);
        Car BIN = new Car("宾利", 5000000.0);
        arrayList.add(BMW);
        arrayList.add(BIN);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(BIN));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            Car car = (Car)iterator.next();
            System.out.println(car);
        }

    }
}
