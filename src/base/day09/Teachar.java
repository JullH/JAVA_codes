package src.base.day09;

public class Teachar extends Person {
    public int work_age;

    public int getWork_age() {
        return this.work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public Teachar(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("好好教书");
    }

    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("老师信息：");
        super.printInfo();
        System.out.println("工龄：" + this.work_age);
        this.teach();
        System.out.println(this.play());
    }
}
