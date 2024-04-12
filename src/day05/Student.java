package src.day05;

public class Student extends Person {
    private double score;

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public String say() {
        String var10000 = super.say();
        return var10000 + this.score;
    }

    public void study() {
        System.out.println(this.getName() + "在学习");
    }
}
