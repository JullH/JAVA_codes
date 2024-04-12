package src.day11;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            public void ring() {
                System.out.println("起床");
            }
        });
    }
}
