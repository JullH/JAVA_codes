package src.jdbc.jdbc.command;


import src.jdbc.common.Dbutils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class PaginationCommand implements Command {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入页号");
        int page = scanner.nextInt();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Dbutils.getConnection();
            String sql = "select * from employee limit ?,10";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, (page - 1) * 10);
            rs = pstmt.executeQuery();
            List<Emp> list = new ArrayList();
            while (rs.next()) {

                Integer eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                Date hiredate = rs.getDate("hiredate");

                list.add(new Emp(eno,ename,salary,dname,hiredate));

            }
            System.out.println(list.size());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutils.closeConnection(rs,pstmt,conn);
        }
    }
}
