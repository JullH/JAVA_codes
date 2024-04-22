package src.base.day16;

public class Homework02 {
    public Homework02() {
    }

    public static void main(String[] args) {
        try {
            new zhuce("jack", "123456", "1@1.com");
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
            return;
        }

        System.out.println("注册成功");
    }
}
