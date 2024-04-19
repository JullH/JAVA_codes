package src.day27.jdbc.command;

import src.day27.common.Dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class UpdateCommand implements Command{
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工编号:");
        int eno = in.nextInt();
        System.out.println("请输入员工调整后薪资:");
        float salary = in.nextFloat();

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = Dbutils.getConnection();
            String sql = "update employee set salary=? where eno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setFloat(1,salary);
            pstmt.setInt(2,eno);

            pstmt.executeUpdate();
            System.out.println("调整成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutils.closeConnection(null,pstmt,conn);
        }
    }
}
