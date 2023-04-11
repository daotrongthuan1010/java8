package FutureJava8;

import CreateList.AddList;
import CreateList.Student;
import java.util.Comparator;
import java.util.function.Function;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestMethodReference {

  public static void main(String[] args) {

    Function<Student, Integer> function =  x -> x.getAge();



    AddList.Student().stream().sorted(Comparator.comparing(Student::getAge)).forEach(x -> System.out.println(x));






  }

}
