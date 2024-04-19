package src.day27.jdbc.command;

import java.sql.*;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class PstmtQueryCommand implements Command{
    @Override
    public void execute() {
        System.out.println("输入部门名称：");
        Scanner scanner = new Scanner(System.in);
        String pdname = scanner.next();
        Connection conn = null;
//        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //1.加载并注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serviceTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true","root","123456");
            //3.创建PreparedStatement对象
            String sql = "select * from employee where dname = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,pdname);
            rs = pstmt.executeQuery();

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
                if(pstmt != null){
                    pstmt.close();
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
