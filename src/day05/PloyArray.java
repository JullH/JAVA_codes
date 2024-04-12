package src.day05;

public class PloyArray {
    public PloyArray() {
    }

    public static void main(String[] args) {
        Person[] persons = new Person[]{new Person("jack", 20), new Student("jack", 20, 90.0), new Student("jack", 20, 90.0), new Teacher("jack", 20, 9000.0), new Teacher("jack", 20, 10000.0)};

        for(int i = 0; i < persons.length; ++i) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();
            } else if (persons[i] instanceof Student) {
                ((Student)persons[i]).study();
            }
        }

    }
}
