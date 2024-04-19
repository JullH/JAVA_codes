package src.day27.jdbc.command;

import java.util.Date;

/**
 * @version 1.0
 * @auther JullH
 */

public class Emp {
    private int eno;
    private float salary;
    private String ename;
    private String dname;
    private Date hiredate;

    public Emp(int eno,String ename, float salary,  String dname, Date hiredate) {
        this.eno = eno;
        this.salary = salary;
        this.ename = ename;
        this.dname = dname;
        this.hiredate = hiredate;
    }



    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
