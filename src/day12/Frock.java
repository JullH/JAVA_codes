package day12;

class Frock {
    private static int currentNum = 100000;
    private int serialNumber = getNextNum();

    public Frock() {
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
