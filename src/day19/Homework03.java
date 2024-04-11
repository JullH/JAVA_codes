package day19;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public Homework03() {
    }

    public static void main(String[] args) {
        Map Map = new HashMap();
        Map.put("jack", 650);
        Map.put("tom", 1200);
        Map.put("jack", 2900);
        Map.put("jack", 2600);
        System.out.println(Map);
        Set set = Map.keySet();
        Iterator var3 = set.iterator();

        while(var3.hasNext()) {
            Object key = var3.next();
            Map.put(key, (Integer)Map.get(key) + 100);
        }

        System.out.println(Map);
        Set set1 = Map.entrySet();
        Iterator var8 = set1.iterator();

        while(var8.hasNext()) {
            Object o = var8.next();
            Map.Entry entry = (Map.Entry)o;
            PrintStream var10000 = System.out;
            String var10001 = String.valueOf(entry.getKey());
            var10000.println(var10001 + "+" + String.valueOf(entry.getValue()));
        }

        System.out.println();
    }
}
