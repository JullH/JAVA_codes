package src.base.day24;

/**
 * @version 1.0
 * @auther JullH
 * 创建线程
 */

public class Threaduse01{
    public static void main(String[] args) {
        //创建对象当线程使用
        Cat cat = new Cat();
        cat.start();
    }

}
class Cat  extends Thread {
    int times = 0;
    @Override
    public void run() {

        while (true){
            times++;
            System.out.println("喵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8){
                break;
            }
        }

    }
}