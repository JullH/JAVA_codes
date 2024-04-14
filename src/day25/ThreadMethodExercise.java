package src.day25;

/**
 * @version 1.0
 * @auther JullH
 */

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException{
        int i = 0;
        Thread thread = new Thread(new hello());
        while (true){
            System.out.println("hi" + (++i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==5){
                thread.start();
                thread.join();
            }

            if(i == 10){
                break;
            }
        }
    }
}
class hello implements Runnable{
    int i = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello" + (++i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10) {
                break;
            }
        }
    }
}