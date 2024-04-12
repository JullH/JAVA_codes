package src.day17;

import java.util.ArrayList;
import java.util.List;

public class Homework02 {
    public Homework02() {
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", "曹雪芹", 100.0));
        list.add(new Book("西游记", "吴承恩", 10.0));
        list.add(new Book("水浒传", "施耐庵", 9.0));
        sort(list);
        System.out.println(list);
    }

    public static void sort(List list) {
        for(int i = 0; i < list.size() - 1; ++i) {
            for(int j = 0; j < list.size() - 1; ++j) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() < book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }

    }
}

