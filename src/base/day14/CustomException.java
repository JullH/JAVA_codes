package src.base.day14;

import java.util.Scanner;

public class CustomException {
    public CustomException() {
    }

    public static void main(String[] args) {
        int age = (new Scanner(System.in)).nextInt();
        if (age >= 18 && age <= 120) {
            System.out.println("输入正常");
        } else {
            throw new Person("18到120之间");
        }
    }
}
