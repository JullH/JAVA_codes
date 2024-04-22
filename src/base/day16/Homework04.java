package src.base.day16;

public class Homework04 {
    public Homework04() {
    }

    public static void main(String[] args) {
        String s = "aaabbbAAA12";
        int a = 0;
        int b = 0;
        int c = 0;
        char[] chars = s.toCharArray();

        for(int i = 0; i < s.length(); ++i) {
            if (Character.isUpperCase(chars[i])) {
                ++a;
            }

            if (Character.isLowerCase(chars[i])) {
                ++b;
            }

            if (Character.isDigit(chars[i])) {
                ++c;
            }
        }

        System.out.println("" + a + " " + b + " " + c);
    }
}
