package src.day18;

import java.util.HashSet;

public class HastSetExercise01 {
    public HastSetExercise01() {
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 12));
        hashSet.add(new Employee("tom", 15));
        hashSet.add(new Employee("jack", 12));
        System.out.println(hashSet);
    }
}
