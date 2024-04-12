package src.day08;

public class Persons {
    public Persons() {
    }

    public static void main(String[] args) {
        Person[] person = new Person[]{new Person("jack", 18, "work"), new Person("tim", 16, "c++"), new Person("tom", 20, "java"), new Person("tom", 26, "java"), new Person("tom", 30, "java"), new Person("tom", 40, "java"), new Person("tom", 90, "java")};

        for(int i = 0; i < person.length; ++i) {
            System.out.println(person[i]);
        }

        Person index = null;

        int i;
        for(i = 0; i < person.length - 1; ++i) {
            for(int j = 0; j < person.length - 1 - i; ++j) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    index = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = index;
                }
            }
        }

        for(i = 0; i < person.length; ++i) {
            System.out.println(person[i]);
        }

    }
}
