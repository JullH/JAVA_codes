package day03;

import java.io.PrintStream;

public class PC extends Computer {
    private String brand;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public void printinfo2() {
        PrintStream var10000 = System.out;
        String var10001 = this.printinfo1();
        var10000.println(var10001 + this.brand);
    }
}
