package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        System.out.println("Class: "+studentClass.getSimpleName());
        for(Annotation annotation : studentClass.getDeclaredAnnotations()){
            System.out.println("Annotation: " + annotation.annotationType());
        }

        for(Method method: studentClass.getDeclaredMethods()){
            System.out.println("\nMethod: " + method.getName());
            for(Annotation annotation : method.getAnnotations()){
                System.out.println("Annotation: " + annotation.annotationType());
            }
        }

    }
}
