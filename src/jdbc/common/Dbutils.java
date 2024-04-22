package src.jdbc.common;

import java.sql.*;

/**
 * @version 1.0
 * @auther JullH
 */

public class Dbutils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //1.加载并注册JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.创建数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serviceTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true","root","123456");
        return conn;
    }

    /*
        关闭连接，释放资源
     */
    public static void closeConnection(ResultSet rs, Statement stmt, Connection conn){
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(stmt != null){
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
