package Objects;

public class Test extends Final{


    final int speedLimit;

    static final String data;

    static{
        data = "New objects";
    }


    public Test() {
        this.speedLimit = 10;
    }

    public static void main(String args[]){

        new Test().run();
    }
}
