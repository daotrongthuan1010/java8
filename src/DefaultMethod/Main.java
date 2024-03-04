package DefaultMethod;

public class Main {
    public static void main(String[] args) {

        DefaultMethodTest defaultMethodTest = new DefaultMethodTest() {
            @Override
            public int device(int a, int b) {
                return DefaultMethodTest.super.device(a, b);
            }
        };

        System.out.println(defaultMethodTest.device(7, 4));
        System.out.println(DefaultMethodTest.add(4,5));


    }
}
