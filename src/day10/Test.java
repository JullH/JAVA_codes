package day10;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        DB2 db2 = new DB2();
        new Test();
        T(mysqlDB);
        T(db2);
    }

    public static void T(DBInterface db) {
        db.connect();
        db.close();
    }
}
