package WrapperTest;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {

        Student student = null;
        Optional<Student> optional = Optional.ofNullable(student);
        if(!optional.isPresent()){
            System.out.println("True");
        }
        System.out.println("False");

        Optional<Student> flatMapTest = Optional.ofNullable(new Student("tram anh", 12, Optional.of(new Address("TB", "123", "Thai Binh"))));
        Optional<Student> addressEmpty = Optional.ofNullable(new Student("tram anh", 12, Optional.empty()));
        System.out.println(flatMapTest.flatMap(Student::getAddress).orElse(null));
        System.out.println("Student null, get Address from flatMap:"+ optional.flatMap(Student::getAddress));
        System.out.println("Address empty, get Addess from flatMap:" + addressEmpty.flatMap(Student::getAddress));
        System.out.println(flatMapTest.map(Student::getAddress));
        System.out.println(addressEmpty.map(Student::getAddress));


        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        Function<String, Integer> function = Integer::valueOf;
        list.stream().map(function).distinct().toList().forEach(System.out::println);
        list.stream().flatMap(x-> Arrays.stream(x.split(""))).toList().forEach(System.out::println);
        System.out.println("Result: "+  list.stream().map(function).findAny().get());
        System.out.println("Result: "+ list.stream().map(function).findFirst().get());


    }
}
