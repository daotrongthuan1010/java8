package DefaultMethod;

public interface DefaultMethodTest {


    default int device(int a, int b){
        return (int) a/b;
    }

    default void show(){
        System.out.println("Default method is running...");
    }

    static int add(int a, int b){
        return  a+b;
    }


    // Chức năng: giúp chúng ta dễ mở rộng interface mà không phá vỡ các class implements từ nó




}
