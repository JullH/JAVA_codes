package src.day25;

/**
 * @version 1.0
 * @auther JullH
 * 多线程
 */

public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}
class SellTicket01 extends Thread{
    private static int ticketnum = 100;

    @Override

    public void run() {

        while (true){
            if (ticketnum <= 0) {
                System.out.println("售完");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() +
                    "售出一张" + "剩余票数" + (--ticketnum));
        }
    }
}