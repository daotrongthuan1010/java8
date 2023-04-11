package MethodReference;

import CreateList.AddList;
import CreateList.Student;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestMethodReference {

  public static void main(String[] args) {

    // lấy ra sinh viên theo từng độ tuổi và sắp xêp chúng theo tên
    AddList.Student().stream().collect(Collectors.groupingBy(Student::getAge, Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getPoint))))).forEach((a, b) -> {
      System.out.print(a+ " ");
      b.forEach(System.out::print);
      System.out.println();
    });

    // lấy ra sinh viên theo từng độ tuổi và tính tổng điểm

    AddList.Student().stream()
        .collect(Collectors.groupingBy(Student::getAge, Collectors.summingDouble(Student::getPoint))).forEach((a, b) -> {
          System.out.print("Độ tuổi: "+ a+ " Tổng điểm: " +b);
          System.out.println();
        });;

    // lấy ra theo tuổi 26 và  sắp xếp theo địa chỉ

    AddList.Student().stream().filter(x -> x.getAge() == 26).sorted(Comparator.comparing(Student::getAddress)).forEach(a -> System.out.println(a));






  }

}
