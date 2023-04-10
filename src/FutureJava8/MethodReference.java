package FutureJava8;

import CreateList.Student;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class MethodReference {

  public static void main(String[] args) {

    String[] a = {"Java", "Php", "C#", "C++", "Ruby", "GoLang"};

    List<String> list = Arrays.asList(a);
    Consumer<String> consumer = x -> System.out.println(x);

//    list.stream().forEach(consumer);
//
//    list.stream().forEach(System.out::println);





  }

}
