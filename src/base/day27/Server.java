package src.base.day27;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * @version 1.0
 * @auther JullH
 */

public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        //2.创建数据包对象接受数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        while (true) {
            //3.接受数据
            socket.receive(packet);

            //4.打印接受数据
            //接受多少，输出多少
            String rs = new String(buffer,0,packet.getLength());
            System.out.println(rs);
            System.out.println(packet.getAddress());
            System.out.println(packet.getPort());
            System.out.println("---------------------");

        }

        //关闭数据发送
//        socket.close();
    }
}
