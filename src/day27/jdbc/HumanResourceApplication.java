package src.day27.jdbc;

import src.day27.jdbc.command.*;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class HumanResourceApplication {
    public static void main(String[] args) {
        System.out.println("1-查询部门名称：");
        System.out.println("2-办理员工入职：");
        System.out.println("3-调整员工薪资：");
        System.out.println("4-员工离职：");


        System.out.println("选择功能");
        Scanner scanner = new Scanner(System.in);
        Integer cmd = scanner.nextInt();
        Command Command = null;
        switch (cmd){
            case 1:
                Command = new PstmtQueryCommand();
                Command.execute();
                break;
            case 2:
                Command = new InsertCommand();
                Command.execute();
                break;
            case 3:
                Command = new UpdateCommand();
                Command.execute();
                break;
            case 4:
                Command = new DeleteCommand();
                Command.execute();
                break;
        }
    }
}
