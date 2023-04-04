package MethodJava8;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@FunctionalInterface
public interface DefaultMethod {

  int sum(int a, int b);

  // Default method không tính là 1 method trong functionalinterface

  default void test() {
    System.out.println("Default method");
  }

  // Static method không tính là 1 method trong functionalinterface
  static void method() {
    System.out.println("Static method");
  }
}
