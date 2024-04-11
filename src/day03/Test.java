package day03;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        PC pc = new PC("i5", 16, 512, "legion");
        NotePad notePad = new NotePad("i6", 8, 256, "ipad");
        pc.printinfo2();
        notePad.printinfo3();
    }
}
