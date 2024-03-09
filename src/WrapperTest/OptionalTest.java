package WrapperTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;s
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {

        Optional<Student> optional = Optional.empty();
        System.out.println("True");
        System.out.println("False");

        Optional<Student> flatMapTest = Optional.of(new Student("tram anh", 12, Optional.of(new Address("TB", "123", "Thai Binh"))));
        Optional<Student> addressEmpty = Optional.of(new Student("tram anh", 12, Optional.empty()));
        System.out.println(flatMapTest.flatMap(Student::getAddress).orElse(null));
        System.out.println("Student null, get Address from flatMap:"+ optional.flatMap(Student::getAddress));
        System.out.println("Address empty, get Address from flatMap:" + addressEmpty.flatMap(Student::getAddress));
        System.out.println(flatMapTest.map(Student::getAddress));
        System.out.println(addressEmpty.map(Student::getAddress));


        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        Function<String, Integer> function = Integer::valueOf;
        list.stream().map(function).distinct().toList().forEach(System.out::println);
        list.stream().flatMap(x-> Arrays.stream(x.split(""))).toList().forEach(System.out::println);
        System.out.println("Result: "+  list.stream().map(function).findAny().get());
        System.out.println("Result: "+ list.stream().map(function).findFirst().get());

        List<String> words = Arrays.asList("Hello", "World");
        List<String> letters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .toList();
        List<String> letterTest = words.stream().map(String::valueOf).toList();
        System.out.println(letters); // Output: [H, e, l, l, o, W, o, r, l, d]

        System.out.println(letterTest);


    }
}
