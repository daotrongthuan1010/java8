package FutureJava8;

import CreateList.Student;

import java.util.Objects;
import java.util.Optional;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestOptional {

  public static void main(String[] args) {
    Student student1 = null;
    Student student2 = null;
    Optional<Student> optionalStudent = Optional.empty();
    Student student3 = new Student("Nguyen Ngoc Ha", 25, "Hai Phong - Viet Nam", 26.2, "D17CN1");
    Student student4 = new Student("Tran Viet Anh", 25, "Thai Binh - Viet Nam", 24.3, "D17CN1");

    try {
      if(Objects.isNull(Optional.ofNullable(optionalStudent))){
        System.out.println("Not null point 1");
      }
    }
    catch (NullPointerException exception){
      System.out.println("Null point 1");
    }
    try {
      if(Objects.isNull(Optional.ofNullable(null))){
        System.out.println("Not null point 2");
      }
    }
    catch (NullPointerException exception){
      System.out.println("Null point 2");
    }

    Optional<Student> optionalTest = Optional.of(new Student("HOA", 12, "Thai Binh", 1.2, "9A"));
    System.out.println("Age student name is HOA: ");
    System.out.println(optionalTest.stream().filter(x -> x.getAddress().equals("Thai Binh")).map(Student::getAge).toList());

    Optional<Student> optionalGet = Optional.ofNullable(student1);

    System.out.println(optionalGet.filter(x -> x.getName().equals("Tran Viet Anh")).orElse(student4));

    Optional.ofNullable(student4);




  }

}
