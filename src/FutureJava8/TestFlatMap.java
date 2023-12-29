package FutureJava8;

import CreateList.Student;

import java.util.Optional;

public class TestFlatMap {



    public static void main(String[] args) {
        Optional<Student> optional = Optional.of(new Student("HOA",12,"Thai Binh",1.2,"9A"));
        System.out.println("Age student name is HOA: ");
        System.out.println(optional.stream().filter(x -> x.getAddress().equals("Thai Binh")).map(Student::getAge).toList());
    }
}
