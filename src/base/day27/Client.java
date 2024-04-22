package src.base.day27;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * @version 1.0
 * @auther JullH
 */

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象
        DatagramSocket socket = new DatagramSocket(7777);

        //2.创建数据包封装数据
        /*public DatagramPacket(byte buf[], int offset, int length) {
            1.要发送的数据
            2.数据大小
            3.服务端ip地址
            4.服务端口号
        }*/
        byte[] bytes = "测试代码".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,
                bytes.length, InetAddress.getLocalHost(), 6666);

        //3.发送数据包
        socket.send(packet);

        //4.关闭数据发送
        socket.close();

    }
}
