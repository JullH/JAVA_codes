package src.day19;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public MapExercise() {
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee_ xiaoming = new Employee_("xiaoming", 3000.0, "20020101");
        Employee_ xiaoli = new Employee_("xiaoli", 16000.0, "20020102");
        Employee_ xiaowang = new Employee_("xiaowang", 13000.0, "20020103");
        hashMap.put(xiaoli.getId(), xiaoli);
        hashMap.put(xiaoming.getId(), xiaoming);
        hashMap.put(xiaowang.getId(), xiaowang);
        Set set = hashMap.keySet();
        Iterator var6 = set.iterator();

        while(var6.hasNext()) {
            Object o = var6.next();
            Employee_ o1 = (Employee_)hashMap.get(o);
            if (o1.getSal() > 6000.0) {
                System.out.println(o1);
            }
        }

        Set set2 = hashMap.entrySet();
        Iterator var12 = set2.iterator();


        while(var12.hasNext()) {
            Object entry = var12.next();
            Map.Entry e = (Map.Entry)entry;
            Employee_ o = (Employee_)e.getValue();
            if (o.getSal() > 13000.0) {
                PrintStream var10000 = System.out;
                String var10001 = String.valueOf(e.getKey());
                var10000.println(var10001 + "+" + String.valueOf(e.getValue()));
            }
        }

        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Employee_ e = (Employee_)entry.getValue();
            if (e.getSal() > 13000.0) {
                System.out.println(e);
            }
        }

    }
}
