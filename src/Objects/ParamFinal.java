package Objects;

public class ParamFinal {
    int cube(final int n){
        return n*n*n;
    }
    public static void main(String args[]){
        ParamFinal b = new ParamFinal();
        System.out.println(b.cube(5));
    }
}
