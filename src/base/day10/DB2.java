package src.base.day10;

public class DB2 implements DBInterface {
    public DB2() {
    }

    public void connect() {
        System.out.println("db2连接成功");
    }

    public void close() {
        System.out.println("db2关闭成功");
    }
}
