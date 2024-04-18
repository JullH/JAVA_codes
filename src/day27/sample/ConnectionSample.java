package src.day27.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @version 1.0
 * @auther JullH
 */

public class ConnectionSample {
    public static void main(String[] args) {
        try {
            //1.加载并注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建数据库连接
            String url = "jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serviceTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
            
            Connection conn = DriverManager.getConnection(url,"root","123456");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
