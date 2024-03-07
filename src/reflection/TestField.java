package reflection;

import java.lang.reflect.Field;

public class TestField {

    public static void main(String[] args) throws Exception {

        Girl girl = new Girl();

        Field field =  girl.getClass().getDeclaredField("name");
        Field  fieldTest =  girl.getClass().getDeclaredField("test");
        field.setAccessible(true);
        fieldTest.setAccessible(true);
        field.set(girl, "Ngoc Ha");
        fieldTest.set(girl, "23");
        System.out.println(girl);
    }
}
