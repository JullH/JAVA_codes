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

public class DeleteCommand implements Command{
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工编号:");
        int eno = in.nextInt();


        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = Dbutils.getConnection();
            String sql = "delete from employee where eno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,eno);

            int cnt = pstmt.executeUpdate();
            if(cnt == 1){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");

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
