package src.base.day15;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public ArrayExercise() {
    }

    public static void main(String[] args) {
        Book[] books = new Book[]{new Book("红楼梦", 100), new Book("金瓶梅新", 90), new Book("青年文摘20年", 5), new Book("java入门到放弃", 300)};
        Arrays.sort(books, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Book)o1).getPrice() - ((Book)o2).getPrice();
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Book)o2).getPrice() - ((Book)o1).getPrice();
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Book)o2).getName().length() - ((Book)o1).getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Book)o1).getName().length() - ((Book)o2).getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
