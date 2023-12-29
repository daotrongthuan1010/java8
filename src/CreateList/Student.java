package CreateList;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

public class Student {

  private String name;

  private int age;

  private String address;

  private Double point;

  private String lopHoc;

  public Student(String name, int age, String address, double point, String lopHoc) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.point = point;
    this.lopHoc = lopHoc;
  }

  public Student() {
  }



  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }

  public String getLopHoc() {
    return lopHoc;
  }

  public void setLopHoc(String lopHoc) {
    this.lopHoc = lopHoc;
  }

  @Override
  public String toString() {
    return "CreateList.Student[ " +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        ", point='" + point + '\'' +
        ", lopHoc='" + lopHoc + '\'' +
         ']';
  }

  public void show(){
    System.out.println( "CreateList.Student[ " +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        ", point='" + point + '\'' +
        ", lopHoc='" + lopHoc + '\'' +
        ']');
  }
}
