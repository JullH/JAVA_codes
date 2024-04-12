package src.day18;

import java.util.HashSet;
import java.util.Iterator;

class Employee_ {
    private String name;
    private double sal;
    private MyDate_ birthday;

    public Employee_(String name, double sal, MyDate_ birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public int hashCode() {
        return this.name.hashCode() + this.birthday.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Employee_ employee = (Employee_)obj;
            return this.name.equals(employee.name) && this.birthday.equals(employee.birthday);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Employee_ employee1 = new Employee_("Alice", 50000.0, new MyDate_(1990, 5, 10));
        Employee_ employee2 = new Employee_("Bob", 60000.0, new MyDate_(1988, 3, 15));
        Employee_ employee3 = new Employee_("Alice", 50000.0, new MyDate_(1990, 5, 10));
        HashSet<Employee_> employees = new HashSet();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("Employees in HashSet:");
        Iterator var5 = employees.iterator();

        while(var5.hasNext()) {
            Employee_ employee = (Employee_)var5.next();
            System.out.println(employee.name + " - Salary: " + employee.sal + " - Birthday: " + employee.birthday.year + "/" + employee.birthday.month + "/" + employee.birthday.day);
        }

    }
}
