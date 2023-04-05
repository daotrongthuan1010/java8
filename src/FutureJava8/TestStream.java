package FutureJava8;

import CreateList.AddList;
import CreateList.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestStream {

  public static void main(String[] args) {
    Map<Integer, List<Student>> studentsByAge = AddList.Student()
        .stream().filter(x-> x.getAge()>=25)
        .collect(Collectors.groupingBy(Student::getAge));

//    for (Map.Entry<Integer, List<Student>> entry : studentsByAge.entrySet()) {
//      int age = entry.getKey();
//      List<Student> students = entry.getValue();
//      System.out.println("Age " + age + ": " + students);
//    }

    studentsByAge.forEach((age, students) -> {
      System.out.println("Age " + age + ": ");
      students.forEach(System.out::println);

      System.out.println(AddList.Student().stream().count());

      System.out.println(AddList.Student().stream().distinct());


    });
  }

}
