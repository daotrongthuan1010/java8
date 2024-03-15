package Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "HP Laptop", 25000000f, "LapTop", LocalDateTime.parse("2023-08-12T10:11:20.136752600")));
        productsList.add(new Product(2, "Lap trinh Java", 25100f, "Book",  LocalDateTime.parse("2024-01-14T20:50:21.136752600")));
        productsList.add(new Product(17, "Iphone 6", 9000000f, "SmartPhone", LocalDateTime.parse("2022-02-14T02:12:50.136752600")));
        productsList.add(new Product(3, "Quat", 252000f, "Electronic", LocalDateTime.parse("2022-02-14T03:12:50.136752600")));
        productsList.add(new Product(4, "Lap trinh C", 49600f, "Book", LocalDateTime.parse("2023-09-10T04:17:50.136752600")));
        productsList.add(new Product(5, "Tinh yeu tuoi 30", 30000f, "Book", LocalDateTime.parse("2023-09-10T04:17:50.136752600")));
        productsList.add(new Product(6, "Lenevo Laptop", 28000000f, "LapTop", LocalDateTime.parse("2021-11-10T01:27:11.136752600")));
        productsList.add(new Product(7, "Sony Z5 Xperia", 28000000f, "SmartPhone", LocalDateTime.parse("2019-01-08T02:11:22.136752600")));
        productsList.add(new Product(8, "Apple Laptop", 90000000f, "LapTop", LocalDateTime.parse("2020-11-11T04:17:29.136752600")));
        productsList.add(new Product(18, "Nồi cơm điện", 4310000f, "Electronic", LocalDateTime.parse("2020-12-08T01:11:01.136752600")));
        productsList.add(new Product(9, "Dac Nhan Tam", 2000000f, "Book", LocalDateTime.parse("2021-11-10T02:07:02.136752600")));
        productsList.add(new Product(10, "Nokia C5", 9000000f, "SmartPhone", LocalDateTime.parse("2022-12-10T09:06:03.136752600")));
        productsList.add(new Product(11, "Apple Laptop", 4000000f, "LapTop", LocalDateTime.parse("2022-06-12T10:11:02.136752600")));
        productsList.add(new Product(12, "Lap trinh den trai tim", 90000f, "Book", LocalDateTime.parse("2021-01-22T05:22:09.136752600")));
        productsList.add(new Product(13, "Laptop ThinkPad", 100000f, "LapTop", LocalDateTime.parse("2021-01-22T05:22:09.136752600")));
        productsList.add(new Product(14, "Xiaomi  C6", 86000000f, "SmartPhone", LocalDateTime.parse("2021-01-22T05:22:09.136752600")));
        productsList.add(new Product(15, "Apple Laptop", 9000000f, "LapTop", LocalDateTime.parse("2021-01-22T05:22:09.136752600")));
        productsList.add(new Product(16, "Lò vi sóng", 1200000f, "Electronic", LocalDateTime.parse("2021-01-22T05:22:09.136752600")));

        productsList.stream().forEach(System.out::println);

        productsList.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(
                Comparator.comparing(Product::getPrice)))).forEach((a, b) -> System.out.println(a + "\n" + b));











    }
}
