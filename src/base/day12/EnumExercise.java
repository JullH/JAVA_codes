package src.base.day12;

public class EnumExercise {
    public EnumExercise() {
    }

    public static void main(String[] args) {
        System.out.println("===所有日期如下===");
        Week[] var1 = Week.values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Week i = var1[var3];
            System.out.println(i);
        }

    }
}
