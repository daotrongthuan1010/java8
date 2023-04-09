package FutureJava8;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@FunctionalInterface
public interface FuntionInterface {

  int sum(int a, int b);

  default void show(){
    System.out.println("functional interface...");
  }
}
