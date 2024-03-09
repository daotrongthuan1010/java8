package MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainCheckTest {
    public static void main(String[] args) {

        // Method Reference tới một phương thức của một đối tượng cụ thể
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.sort(Comparable::compareTo);
        names.sort(Comparator.comparing(String::new));

        Consumer<String> consumer = x-> System.out.println(x);
        Consumer<String> consumerTest = System.out::println;
        Comparator<String> comparator = Comparable::compareTo;

        names.forEach(System.out::println);

        // Method Reference tới một phương thức của một đối tượng không cụ thể
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

        // Method Reference tới một phương thức của một đối tượng kiểu tạo
         Function<String, String> function= x-> new String(x);
         Function<String, String> functionTest = String::new;
         Function<String, Integer> functionConvert = x -> Integer.valueOf(x);
         Function<String, Integer> functionConvertTest =  Integer::valueOf;


        List<String> newList = names.stream()
                .map(String::new)
                .toList();

        // Method Reference tới một phương thức của một đối tượng kiểu tạo với đối số
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);


    }
    public static void Check(String a) {

        if(Objects.isNull(a)){
            System.out.println("A is null");
        }
        System.out.println("A is not null");

    }



}
