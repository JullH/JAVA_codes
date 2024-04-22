package src.base.day19;

import java.util.ArrayList;

public class Homework01 {
    public Homework01() {
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\""));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜中，捞起一看赶紧放生"));
        arrayList.add(new News("哈哈我的"));

        for(int i = arrayList.size() - 1; i >= 0; --i) {
            System.out.println(arrayList.get(i));
        }

    }
}
