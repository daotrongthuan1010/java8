package Annotation;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Student student = new Student();
        student.setDateOfBirth(LocalDateTime.now());
        student.setName("ThuanDao");

        String json =HandlerAnnotationJsonConvert.toJson(student);
        System.out.println(json);
    }
}
