package FutureJava8;

import CreateList.Student;
import java.util.Optional;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class TestOptional {

  public static void main(String[] args) {
    Student student = new Student();
    Student student1 = null;
    Student student2 = null;
    Student student3 = new Student("Nguyen Ngoc Ha", 25, "Hai Phong - Viet Nam", 26.2, "D17CN1");
    Student student4 = new Student("Tran Viet Anh", 25, "Thai Binh - Viet Nam", 24.3, "D17CN1");


//✓ Kiểm tra null là không cần thiết.
//✓ Không còn NullPointerException trong thời gian chạy.
//✓ Phát triển các API sạch sẽ và gọn gàng.
//✓ Không còn mã bad


    // Null pointer
//    Optional<Student> optional = Optional.of(student1);
//    System.out.println(optional.get());

//    Optional<Student> optional = Optional.empty();
//    System.out.println(optional.orElse(student4));
//
//      Optional<Student> optional1 = Optional.ofNullable(null);
//    System.out.println(optional1.orElse(student4));

    Optional<Student> optional = Optional.ofNullable(student1);

//    System.out.println(optional.filter(x -> x.getName().equals("Tran Viet Anh")).orElse(student4));

//    optional.ofNullable(student4);


/*

✓ filter - Nếu giá trị có mặt và khớp với vị ngữ đã cho, trả về Tùy chọn này;
nếu không, trả về cái trống
✓ isPresent - Trả về true nếu có giá trị; nếu không, trả về false
✓ isPresent - Nếu có giá trị, hãy gọi  chỉ định với giá trị; Khác
không làm gì cả
✓ get - Trả về giá trị được bao bọc bởi Tùy chọn này nếu có; nếu không, ném một
NoSuchElementException

✓ map - Nếu có một giá trị, hãy áp dụng chức năng ánh xạ được cung cấp cho nó
✓ orElse - Trả về giá trị nếu có; nếu không, trả về giá trị mặc định đã cho
✓ orElseGet - Trả về giá trị nếu có; nếu không, trả về cái được cung cấp bởi cái đã cho
Cung cấp
✓ orElseThrow - Trả về giá trị nếu có; nếu không, ném ngoại lệ được tạo bởi
cho Nhà cung cấp





 */













  }

}
