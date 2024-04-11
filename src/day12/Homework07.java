package day12;

public class Homework07 {
    public Homework07() {
    }

    public static void main(String[] args) {
        Car car1 = new Car(60.0);
        Car car2 = new Car(-10.0);
        Car car3 = new Car(20.0);
        car1.getAir().flow();
        car2.getAir().flow();
        car3.getAir().flow();
    }
}
