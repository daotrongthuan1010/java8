package Caculator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Minh Anh", "Tram Anh", "Viet Anh", "Ngoc Ha", "Anh Minh", "Thu Ha", "Ngoc Linh", "The Vuong", "Son Long");

        List<Integer> listInteger = Arrays.asList(1, 100, 89, 7, 9, 8, 1, 10, 7, 121, 100, 7, 12, 13, 19, 17);

        listString.sort(Comparator.comparing(String::toString).reversed());

        listString.stream().filter(x->x.contains("Anh")).forEach(System.out::print);

        Float result = listInteger.stream().reduce(0, (a, b) -> a +b ).floatValue();

        System.out.println("..............................................");
        listInteger.stream().forEachOrdered(x-> {
            System.out.println(x);
        });

        System.out.println(".............................................");

        System.out.println("Result: " +result);

        listString.forEach(System.out::println);

    }
}
