package src.base.day08;

class Teach extends Teachar {
    public Teach(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println("1.3");
        super.introduce();
    }
}
