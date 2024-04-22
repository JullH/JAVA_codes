package src.base.day01;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Find {
    Find() {
    }

    public int[][] findway(int[][] map, int i, int j) {
        if (map[4][4] == 2) {
            return map;
        } else if (map[i][j + 1] == 0) {
            map[i][j + 1] = 2;
            return this.findway(map, i, j + 1);
        } else if (map[i + 1][j] == 0) {
            map[i + 1][j] = 2;
            return this.findway(map, i + 1, j);
        } else if (map[i][j - 1] == 0) {
            map[i][j - 1] = 2;
            return this.findway(map, i, j - 1);
        } else if (map[i - 1][j] == 0) {
            map[i - 1][j] = 2;
            return this.findway(map, i - 1, j);
        } else {
            return null;
        }
    }
}
