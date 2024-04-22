package src.base.day01;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

class Account {
    Account() {
    }

    public static void main(String[] args) {
        int[][] map = new int[][]{{1, 1, 1, 1, 1, 1}, {1, 0, 0, 1, 1, 1}, {1, 1, 0, 0, 1, 1}, {1, 0, 0, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}};

        for(int i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                System.out.print(map[i][j] + " ");
            }

            System.out.print("\n");
        }

        Find find = new Find();
        Scanner scanner = new Scanner(System.in);
        int sti = scanner.nextInt();
        int stj = scanner.nextInt();
        map[sti][stj] = 2;
        map = find.findway(map, sti, stj);
        find.findway(map, sti, stj);

        for(int i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                System.out.print(map[i][j] + " ");
            }

            System.out.print("\n");
        }

    }
}
