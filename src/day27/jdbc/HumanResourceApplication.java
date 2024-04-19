package src.day27.jdbc;

import src.day27.jdbc.command.Command;
import src.day27.jdbc.command.QueryCommand;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther JullH
 */

public class HumanResourceApplication {
    public static void main(String[] args) {
        System.out.println("1-查询部门名称：");
        Scanner scanner = new Scanner(System.in);
        Integer cmd = scanner.nextInt();
        switch (cmd){
            case 1:
                Command Command = new QueryCommand();
                Command.execute();
                break;
        }
    }
}
