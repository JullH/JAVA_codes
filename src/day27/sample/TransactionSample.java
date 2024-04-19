package src.day27.sample;

import src.day27.common.Dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class TransactionSample {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = Dbutils.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            for (int i = 1; i < 1001; i++) {
                if(i==5){
//                    throw new RuntimeException("插入失败");
                }
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i);
                pstmt.setString(2, "员工"+i);
                pstmt.setFloat(3, 4000);
                pstmt.setString(4, "市场部");
                pstmt.executeUpdate();
            }

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null && !conn.isClosed())
                    conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            Dbutils.closeConnection(null,pstmt,conn);
        }

    }
}
