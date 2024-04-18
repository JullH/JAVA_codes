package src.day27.sample;
import java.sql.*;


/**
 * @version 1.0
 * @auther JullH
 */

public class StandardJDBCSample {
    public static void main(String[] args){
        Connection conn = null;
        try {
//        1.加载并注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.创建数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/imooc", "root", "123456"
            );
//        3.创建statement对象
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
//        4.遍历查询结果
            while (rs.next()) {
                Integer eno = rs.getInt(1);
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(dname + "-" + eno + "-" + ename + "-" + salary);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //           5.关闭连接，释放资源
            try {
                if(conn!=null&&conn.isClosed() == false){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
