package week05.Stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamintermediateOperations {
    public static void main(String[] args) {
        //peak();
//        List<String> collect = Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value : " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value : " + e))
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

//        List<Integer> collect1 = Stream.of(1, 2, 3, 4, 5)
//                .peek(i -> System.out.printf("%d", i))
//                .map(i -> i * 1)
//                .peek(i -> System.out.printf("%d", i)).collect(Collectors.toList());
//
//        System.out.println(collect1);

        // filter
//        IntStream.rangeClosed(0, 10)
//                .filter(i -> i % 2 == 0)
//                .map(i -> i * 3)
//                .forEach(System.out::println);

        // Empty String' leri kaldırmak için filter() metodu kullanalim.
//        Stream.of("Alperen", "Muhammed", "", "Mustafa").
//                filter(name -> !name.isEmpty())
//                .forEach(System.out::println);
//    }

        // distinct() -> yinelenen (duplicate) değerlerin(value)
        // kaldırıldığı (remove) bir stream döndürür.
//        Stream.of("Java", "java", "java8", "jAva")
//                .distinct().forEach(System.out::println);

        // Skip & limit()
        // skip(n) discord ,işlemidir. n negatif olamaz.
//        Stream.iterate(10, n -> n+2)
//                .skip(3) // 10, 12, 14 değerlerini atla.
//                .limit(5)
//                .forEach(System.out::println);
//
        // map() -> verileri dönüştürmek için kullanılır.
        // map interface' indeki Key, value çifti tutan yapıyla karıştırmamalıdır.
//        Stream<String> s = Stream.of("Alperen","Ali", "Ayla");
//        s.map(String::length)s.forEach(System.out::println);

//        List<String> stringList = Arrays.asList("1","2","3","4","5","6");
//        List<Integer> evenNumberList = stringList.stream()
//                .map(Integer::valueOf)
//                .filter(number -> number % 2 == 0)
//                .toList();
//
//        System.out.println(evenNumberList);


        //flatMap();

        List<List<Integer>> nesnedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> flattenedList = nesnedList.stream()
                .flatMap(List::stream) // Her iç liste için bir Stream oluşturup birleştirelim.
                .collect(Collectors.toList());

        System.out.println(nesnedList);
        System.out.println(flattenedList);

        nesnedList.stream().map(i -> i.stream().map(j -> j *2).collect(Collectors.toList())).forEach(System.out::println);


    }
}