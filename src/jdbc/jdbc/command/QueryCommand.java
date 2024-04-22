package src.jdbc.jdbc.command;

import java.sql.*;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class QueryCommand implements Command{
    @Override
    public void execute() {
        System.out.println("输入部门名称：");
        Scanner scanner = new Scanner(System.in);
        String pdname = scanner.next();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.加载并注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serviceTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true","root","123456");
            //3.创建statement对象
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from employee where dname = '" + pdname + "'");

            //4.遍历查询结果
            while (rs.next()){
                Integer eno = rs.getInt(1);
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(dname + "-" + eno + "-" + ename + "-" + salary);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
}
