package day14;

public class Homework01 {
    public Homework01() {
    }

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("输入应为2个整数");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException var5) {
            System.out.println(var5.getMessage());
        } catch (NumberFormatException var6) {
            System.out.println("输出格式不对");
        } catch (ArithmeticException var7) {
            System.out.println("被除数不能为零");
        }

    }

    public static double cal(int n1, int n2) {
        return (double)(n1 / n2);
    }
}
