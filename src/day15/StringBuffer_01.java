package src.day15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringBuffer_01 {
    public StringBuffer_01() {
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 7, 3};
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
