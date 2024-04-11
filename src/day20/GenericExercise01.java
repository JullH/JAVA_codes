package day20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GenericExercise01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",20));
        students.add(new Student("mary",19));

        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

        HashMap<String, Student> map = new HashMap<>();
        map.put("milan",new Student("milan",38));
        map.put("smith",new Student("smith",48));
        map.put("java",new Student("java",58));

        Iterator<Map.Entry<String, Student>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey() + "+" + next.getValue());
        }

    }
}
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}