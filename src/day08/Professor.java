package day08;

class Professor extends Teachar {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println("1.1");
        super.introduce();
    }
}

