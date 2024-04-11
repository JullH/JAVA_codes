package day16;

public class Homework01 {
    public Homework01() {
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(reverse(s, 1, 4));
    }

    public static String reverse(String str, int start, int end) {
        char[] ch = str.toCharArray();
        int i = start;

        for(int j = end; i < j; --j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            ++i;
        }

        str = new String(ch);
        return str;
    }
}
