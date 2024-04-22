package src.base.day08;

class Professor_ extends Teachar {
    public Professor_(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println("1.2");
        super.introduce();
    }
}
