package MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainTestRandom {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tram Anh", "Minh Anh", "Viet Anh", "Ngoc Linh", "Thanh Trung", "Ha");
        list.sort(Comparator.comparing(String::length).reversed());
        list.forEach(System.out::println);
    }
}
