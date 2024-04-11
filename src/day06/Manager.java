package day06;

public class Manager extends Empoloyee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println(this.getName() + "在管理");
    }

    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
