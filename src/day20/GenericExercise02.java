package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("tom", 20000, new MyData(2000, 3, 4)));
        employee.add(new Employee("jack", 10000, new MyData(2002, 4, 3)));
        employee.add(new Employee("tom", 120000, new MyData(2000, 3, 26)));

        System.out.println(employee);

        employee.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().compareTo(o2.getName()) != 0)
                    return o1.getName().compareTo(o2.getName());

                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(employee);

    }
}

class MyData implements Comparable<MyData>{
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyData o) {
        if ((year - o.getYear()) != 0)
            return year - o.getYear();

        if ((month - o.getMonth()) != 0)
            return month - o.getMonth();

        int i = day - o.getDay();
        return i;

    }
}

class Employee {
    private String name;
    private double sal;
    private MyData birthday;

    public Employee(String name, double sal, MyData birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                "}\n";
    }
}