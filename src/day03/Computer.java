package src.day03;

public class Computer {
    private String CPU;
    private int memory;
    private int disk;

    public String getCPU() {
        return this.CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return this.disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String printinfo1() {
        return this.CPU + this.memory + this.disk;
    }
}