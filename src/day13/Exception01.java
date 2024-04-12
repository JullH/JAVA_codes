package src.day13;

public class Exception01 {
    public Exception01() {
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int var10000 = num1 / num2;
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

        System.out.println(111);
    }
}
