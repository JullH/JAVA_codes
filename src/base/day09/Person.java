package src.base.day09;

public class Person {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, char sex, int age) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    public String play() {
        return this.name + "爱玩";
    }

    public void printInfo() {
        System.out.println("姓名：" + this.name + "\n年龄：" + this.age + "\n性别：" + this.sex);
    }
}
