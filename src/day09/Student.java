package day09;

public class Student extends Person {
    private String stu_id;

    public String getStu_id() {
        return this.stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("好好学习");
    }

    public String play() {
        return super.play() + "足球";
    }

    public void printInfo() {
        System.out.println("学生信息：");
        super.printInfo();
        System.out.println("学号：" + this.stu_id);
        this.study();
        System.out.println(this.play());
    }
}
