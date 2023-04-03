package CreateList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class AddList {



  public static List<Student> Student() {
   List<Student> list = new ArrayList<>();

    Student student = new Student("Nguyen Van Quyet", 26, "Thai Binh - Viet Nam", 22.1, "D17CN4");
    Student student1 = new Student("Nguyen Ngoc Ha", 25, "Hai Phong - Viet Nam", 26.2, "D17CN1");
    Student student2 = new Student("Tran Viet Anh", 24, "Thai Binh - Viet Nam", 24.3, "D17CN1");
    Student student3 = new Student("Nguyen Thu Huong", 26, "Ha Noi - Viet Nam", 28.1, "D17CN3");
    Student student4 = new Student("Nguyen Ngoc Linh", 26, "Ha Noi - Viet Nam", 26.8, "D17CN4");
    Student student5 = new Student("Do Minh Anh", 25, "Ninh Binh - Viet Nam", 22.6, "D17CN2");
    Student student6 = new Student("Dao Trong Thuan", 26, "Thai Binh - Viet Nam", 25.1, "D17CN4");
    Student student7 = new Student("Do Van Vu", 27, "Hai Phong - Viet Nam", 20.4, "D17CN3");
    Student student8 = new Student("Nguyen The Vuong", 26, "Quang Ninh - Viet Nam", 16.5, "D17CN1");
    Student student9 = new Student("Cao Minh Chung", 26, "Thai Binh - Viet Nam", 22.9, "D17CN5");
    Student student10 = new Student("Le Quoc Hung", 28, "Ha Noi - Viet Nam", 19.8, "D17CN5");
    Student student11 = new Student("Vu Xuan Yan", 27, "Quang Ninh - Viet Nam", 5.7, "D17CN6");
    Student student12 = new Student("Ha Thi Minh Anh", 26, "Thai Binh - Viet Nam", 26.6, "D17CN4");
    Student student13 = new Student("Tran Viet Anh", 25, "Hai Phong - Viet Nam", 28.7, "D17CN2");
    Student student14 = new Student("Do Van Son", 26, "Thai Binh - Viet Nam", 22.5, "D17CN5");
    Student student15 = new Student("Le Tan Sang", 28, "Ha Noi - Viet Nam", 22.8, "D17CN5");
    Student student16 =
        new Student("Nguyen Duy Phuong", 31, "Quang Ninh - Viet Nam", 15.6, "D17CN6");
    Student student17 =
        new Student("Pham Thi Phuong Ngoan", 26, "Thai Binh - Viet Nam", 24.4, "D17CN4");
    Student student18 = new Student("Tran Viet Anh", 22, "Hai Phong - Viet Nam", 19.1, "D17CN2");

    list.add(student);
    list.add(student1);
    list.add(student2);
    list.add(student3);
    list.add(student4);
    list.add(student5);
    list.add(student6);
    list.add(student7);
    list.add(student8);
    list.add(student9);
    list.add(student10);
    list.add(student11);
    list.add(student12);
    list.add(student13);
    list.add(student14);
    list.add(student15);
    list.add(student16);
    list.add(student17);
    list.add(student18);

    return list;
  }

  public AddList() {
  }
}
