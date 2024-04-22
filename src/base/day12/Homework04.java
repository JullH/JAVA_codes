package src.base.day12;

public class Homework04 {
    public Homework04() {
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.textWork(new Way() {
            public void work() {
                System.out.println(123);
            }
        });
    }
}
