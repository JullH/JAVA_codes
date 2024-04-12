package src.day06;

public class Work extends Empoloyee {
    public Work(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(this.getName() + "在工作");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
