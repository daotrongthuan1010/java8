package MethodReference;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class StaticMethod {

  public static void main(String[] args) {

    System.out.println( doAction(4,6, MathUtils::sub));

  }

  public static int doAction(int a, int b, ExecuteFunctionTest executeFunctionTest){
    return  executeFunctionTest.execute(a,b);
  }

}
