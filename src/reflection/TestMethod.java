package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Girl> girlClass = Girl.class;
        Method[] methodFull = girlClass.getMethods();
        Arrays.stream(methodFull).forEach(x-> System.out.println(x));
        System.out.println("-----------------------------------------");
        Method methodSetName = girlClass.getMethod("setName", String.class);
        Method methodSetTest = girlClass.getMethod("setTest", String.class);

        Girl girl1 = girlClass.newInstance();

        methodSetName.invoke(girl1, "Tram Anh");
        methodSetTest.invoke(girl1, "24");
        System.out.println(girl1);
    }
}
