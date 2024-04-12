package src.day10;

public class MysqlDB implements DBInterface {
    public MysqlDB() {
    }

    public void connect() {
        System.out.println("连接成功");
    }

    public void close() {
        System.out.println("关闭成功");
    }
}
