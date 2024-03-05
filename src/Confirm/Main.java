package Confirm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        list.forEach(System.out::print);
    }
}
