package src.jdbc.jdbc.command;

import src.jdbc.common.Dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class InsertCommand implements Command{
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工编号:");
        int eno = in.nextInt();
        System.out.println("请输入员工姓名:");
        String ename = in.next();
        System.out.println("请输入员工薪资:");
        float salary = in.nextFloat();
        System.out.println("请输入员工部门:");
        String dname = in.next();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = Dbutils.getConnection();
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, eno);
            pstmt.setString(2, ename);
            pstmt.setFloat(3, salary);
            pstmt.setString(4, dname);
            int i = pstmt.executeUpdate();
            if (i == 1) {
                System.out.println("入职已办理");
            }else {
                System.out.println("办理失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutils.closeConnection(null,pstmt,conn);
        }

    }
}
