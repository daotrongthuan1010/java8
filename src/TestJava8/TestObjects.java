package TestJava8;

import CreateList.AddList;
import CreateList.Student;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestObjects {

  public static void main(String[] args) {


    Student student = new Student();
    Student student1 = null;
    Student student2 = null;
    Student student3 = new Student("Nguyen Ngoc Ha", 25, "Hai Phong - Viet Nam", 26.2, "D17CN1");
    Student student4 = new Student("Tran Viet Anh", 25, "Thai Binh - Viet Nam", 24.3, "D17CN1");

    //Is null

    System.out.println(Objects.isNull(AddList.Student()));
    System.out.println(Objects.isNull(student));
    System.out.println(Objects.isNull(student1));

    // compare
    System.out.println(Objects.equals(student1, student2));
    System.out.println(Objects.compare(student4, student3, Comparator.comparing(Student::getPoint)));
    System.out.println(Objects.compare(student1, student2, Comparator.comparing(Student::getPoint)));

    //
    System.out.println(Objects.checkIndex(2,AddList.Student().size()));
    System.out.println(Objects.deepEquals(student3.getAge(), 25));
    System.out.println(Objects.requireNonNullElse(student2,student4));


    Objects.requireNonNullElseGet(student2,  () -> student4.toString());





  }

}
