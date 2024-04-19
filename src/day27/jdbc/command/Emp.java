package src.day27.jdbc.command;

/**
 * @version 1.0
 * @auther JullH
 */

public class Emp {
    int eno;
    float salary;
    String ename;
    String dname;

    public Emp(int eno, String ename, float salary, String dname) {
        this.eno = eno;
        this.salary = salary;
        this.ename = ename;
        this.dname = dname;
    }


}
