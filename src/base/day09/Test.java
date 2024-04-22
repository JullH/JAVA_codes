package src.base.day09;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Student student = new Student("jack", '男', 20, "202001060106");
        student.printInfo();
        Teachar teachar = new Teachar("jack2", '男', 30, 6);
        teachar.printInfo();
    }
}