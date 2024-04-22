package src.base.day03;

import java.io.PrintStream;

public class NotePad extends Computer {
    String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public void printinfo3() {
        PrintStream var10000 = System.out;
        String var10001 = this.printinfo1();
        var10000.println(var10001 + this.color);
    }
}
