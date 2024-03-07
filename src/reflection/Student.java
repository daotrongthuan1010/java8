package reflection;

@SuppressWarnings("deprecation")
@Deprecated
public class Student {
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

