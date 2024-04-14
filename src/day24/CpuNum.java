package src.day24;

/**
 * @version 1.0
 * @auther JullH
 */

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);

    }
}
