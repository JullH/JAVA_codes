package day05;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public String say() {
        String var10000 = super.say();
        return var10000 + this.salary;
    }

    public void teach() {
        System.out.println(this.getName() + "在教书");
    }
}
