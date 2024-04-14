package src.day25;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        new B(a).start();
        a.start();
    }
}

class A extends Thread {
    private boolean Loop = true;

    public void setLoop(boolean loop) {
        Loop = loop;
    }

    @Override
    public void run() {
        while (Loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                break;
            }
        }
    }
}