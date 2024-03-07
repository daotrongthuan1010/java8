package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructor {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Girl> girlClass = Girl.class;
        Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class, String.class);
        Girl girl = girlConstructor.newInstance("Tram Anh", "23");
        System.out.println(girl);
    }
}
