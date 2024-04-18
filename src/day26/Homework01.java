package src.day26;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @auther JullH
 */

public class Homework01 {
    public static void main(String[] args) throws Exception {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestObj = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj,"天龙");
        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTestObj);
        System.out.println(invoke);
    }



}
class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }

}