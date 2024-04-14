package src.day25;

/**
 * @version 1.0
 * @auther JullH
 */

public class Threaduse03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();

        //守护线程，主线程结束，子线程结束
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("工作");
            Thread.sleep(500);

        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天");
        }
    }
}