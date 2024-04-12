package src.day14;

import java.util.Scanner;

public class Try_catch_ {
    public Try_catch_() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        while(true) {
            String s = scanner.next();

            try {
                n = Integer.parseInt(s);
                break;
            } catch (Exception var5) {
                System.out.println("请输入一个整数");
            }
        }

        System.out.println("整数" + n);
    }
}
