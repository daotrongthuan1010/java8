package FuntionalInterface;

import java.util.Arrays;
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
public class TypeFuntionalInteface {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Mary", "Peter", "David");

    // Sử dụng Method Reference để in tên
//    names.forEach(x-> System.out.println(x));

    // Lay ra cac phan tu
    Consumer<String> consumer = x -> System.out.println(x);

    // tuong duong voi viec sau

//    Consumer consumer1 =  new Consumer() {
//      @Override
//      public void accept(Object o) {
//        System.out.println(o);
//      }
//    };


    //Loc co dieu kien
    Predicate<String> predicate = x -> x.equals("dobule");

//    Predicate predicate1 = new Predicate() {
//      @Override
//      public boolean test(Object o) {
//      if(o.equals("double")){
//        return false;
//      }
//      return  true;
//
//      }
//    };

    // Nhan vao 1 kieu tra ve kieu tuong duong
    Function<Integer, String> function = x -> String.valueOf(x.intValue());

    //Khong nhan vao gi, tra ve 1 kieu
    Supplier<String> supplier = () -> String.valueOf(Math.random());




//    names.forEach(consumer);

    names.forEach(System.out::println);

//    for (String s: names) {
//      System.out.println(s);
//    }
//
//    // Sử dụng Method Reference để sắp xếp tên theo thứ tự alphabet
//    names.sort(String::compareToIgnoreCase);
//    System.out.println("Sorted Names: " + names);


  }

}
