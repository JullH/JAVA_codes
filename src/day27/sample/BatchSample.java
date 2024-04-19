package src.day27.sample;

import src.day27.common.Dbutils;

import java.sql.*;
import java.util.Date;
import java.util.Map;


/**
 * @version 1.0
 * @auther JullH
 */

public class BatchSample {
    public static void tc1() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            long startTime = new Date().getTime();
            conn = Dbutils.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            for (int i = 1; i < 100000; i++) {

                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i);
                pstmt.setString(2, "员工"+i);
                pstmt.setFloat(3, 4000);
                pstmt.setString(4, "市场部");
                pstmt.executeUpdate();
            }

            conn.commit();
            long endTime = new Date().getTime();
            System.out.println("tc1"+(startTime - endTime));
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


//    批处理
    public static void tc2() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            long startTime = new Date().getTime();
            conn = Dbutils.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            for (int i = 100000; i < 200000; i++) {

                pstmt.setInt(1, i);
                pstmt.setString(2, "员工"+i);
                pstmt.setFloat(3, 4000);
                pstmt.setString(4, "市场部");
                pstmt.addBatch();//将参数加入批处理任务
            }
            pstmt.executeBatch();//执行批处理任务

            conn.commit();
            long endTime = new Date().getTime();
            System.out.println("tc2"+(startTime - endTime));
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

    public static void main(String[] args) {
        tc1();
        tc2();
    }

}
