package day08;

public class Homework03 {
    public Homework03() {
    }

    public static void main(String[] args) {
        Teachar teachar1 = new Professor("1", 20, "1.1", 8000.0, 1.1);
        Teachar teachar2 = new Professor_("2", 30, "1.2", 9000.0, 1.2);
        Teachar teachar3 = new Teach("3", 40, "1.3", 10000.0, 1.3);
        teachar1.introduce();
        teachar2.introduce();
        teachar3.introduce();
    }
}
