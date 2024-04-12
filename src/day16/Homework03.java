package src.day16;

public class Homework03 {
    public Homework03() {
    }

    public static void main(String[] args) {
        String s = "Willian jefferson Clinton";
        s = "huang jing g";
        System.out.println(print(s));
    }

    public static String print(String s) {
        String[] s1 = s.split(" ");
        return s1[2] + "," + s1[0] + "." + Character.toUpperCase(s1[1].charAt(0));
    }
}
