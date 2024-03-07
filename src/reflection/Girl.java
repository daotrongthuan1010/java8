package reflection;

import java.lang.reflect.Field;

public class Girl {
    private String name;

    private String test;

    public Girl() {

    }

    public Girl(String name, String test) {
        this.name = name;
        this.test = test;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' + "test="+ test+
                '}';
    }

}
