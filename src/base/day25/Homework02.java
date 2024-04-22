package src.base.day25;

/**
 * @version 1.0
 * @auther JullH
 */

public class Homework02 {
    public static void main(String[] args) {
        Qu qu = new Qu();
        Thread thread1 = new Thread(qu);
        Thread thread2 = new Thread(qu);
        thread1.start();
        thread2.start();
    }
}

class Qu implements Runnable {
    private int sal = 10000;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {

                if (sal < 1000) {
                    System.out.println("余额不足");
                    break;
                }


                sal -= 1000;
                System.out.println(Thread.currentThread().getName()+"取出1000" + "剩余" + sal);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}