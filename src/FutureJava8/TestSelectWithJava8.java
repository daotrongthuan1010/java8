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
public class TestSelectWithJava8 {

  public static void main(String[] args) {
   Map<Integer, List<Student>> map = AddList.Student().stream().collect(Collectors.groupingBy(Student::getAge));

    System.out.println(AddList.Student().stream().count());
    AddList.Student().stream().forEach(n -> System.out.println(n));

    for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
      System.out.println("Age " + entry.getKey() + ": ");
      for (Student student : entry.getValue()) {
        System.out.println(student);
      }
    }


  }
}
