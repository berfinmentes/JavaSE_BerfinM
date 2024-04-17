package week05.Stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4);

        //List'i (Ya da çoklu veri yapısını) stream' a dönüştürebilirim.
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();

        // Generate & Iteration
        // Random sayılar oluşturabiliriz. Iterasyon yapabiliriz.
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        Stream<Integer> addNumbers = Stream.iterate(1, n -> n + 2).limit(4);
        randoms.forEach(System.out::println);
        addNumbers.forEach(System.out::println);

        // Stream pipeline flow
        Arrays.stream(Object.class.getMethods())//source
                .map(Method::getName) // Intermediate operation
                .distinct() // Intermediate operation
                .forEach(System.out::println); // terminal operation

        //range ve rangeClosed
        IntStream.range(1, 10).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).map(e -> e * 2).forEach(System.out::println);
        // Başlangıç ve bitiş değerleri verilerek bir IntStream de oluşturabilirz.
        IntStream.iterate(10, i-> i+5)
                .limit(6)
                .forEach(System.out::println);

        // sorted() -> doğal sıralamaya göre sıralar. Comparable interface' inden implement
        // barındırdığı sürece efektif bir şekilde çalışır.
        // Stream<T> sorted(Comparator<? super T> comparator)
//         Stream<String> s1 = Stream.of("brown", "bear", "bee");
//         s1.sorted().forEach(System.out::println);
        // Not! sorted()  metodunu kullandığımızda ' Java.lang.OutOfMemoryError : Java Hesap space hatası alıyor.

//        Stream.generate(()-> "Luci")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

        // count() -> sonlu bir Stream' deki öğelerin sayısını belirler.
//        Stream<String> s2 = Stream.of("k1", "k2", "k3");
//        long countElement = s2.count();
//        System.out.println(countElement);

        // min(), max() String veya Array' in minimum veya maximum değerlerini bulabiliriz.

//        Stream<String> stream01 = Stream.of("eagle", "lion", "racoon");
//        Stream<String> stream02 = Stream.of("eagle", "lion", "racoon");

//        Comparator<String> comp = Comparator.comparingInt(String::length);
//
//        Optional<String> min = stream01.min(comp);
//        Optional<String> max = stream02.max(comp);
//        System.out.println(min);
//        System.out.println(max);
//
//        String[] stringArr = "merhaba dünya ben alperen, nasılsın?".split(" ");
//        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());
//        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
//
//        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
//        System.out.println(Arrays.stream(stringArr).min(lengthCompare).get());

        //findAny() & findFirst()
        //findAny() -> Stream' daki öğelerden birini döndürür
        // Stream' de hiçbir öğe yoksa boş bir Optional<T> object döndürür.

        //findFirst() Stream' deki ilk öğeyi döndürür. Hiçbir öğe yoksa Optional<T> nesnesi döndürür.
        //findFirst() akışın ilk öğelerini döndürür ancak findAny() akıştaki herhangi bir
        // öğeyi seçmekte özgürdür.(Özellikle paralel stream kullandığında )
//        Stream<String> s = Stream.of("monkey", "gorilla", "dog");
//        Stream<String> infinite = Stream.generate(() -> "chimp");
//
//        s.findAny().ifPresent(System.out::println);
//        infinite.findAny().ifPresent(System.out::println);

//        OptionalDouble temperature = DoubleStream.of(-10.1, -5.0, 30.0, -7.3, 41.2, 2.2)
//                .filter(temp -> temp > 0)
//                .findAny();
//
//        OptionalDouble temperature2 = DoubleStream.of(-10.1, -5.0, 30.0, -7.3, 41.2, 2.2)
//                .filter(temp -> temp > 0)
//                .findFirst();
//
//        System.out.println(temperature);
//        System.out.println(temperature2);
//
//        //anyMatch(), allMatch(), noneMatch()
//        List<String> list = Arrays.asList("monkey", "2", "chimp");
//
//        Stream<String> infiniteQ1 = Stream.generate(() -> "Chimp");
//        Stream<String> infiniteQ2 = Stream.generate(() -> "Chimp");
//
//        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        //anyMatch(), Stream' de verilen Predicate ile eşleşen herhangi bir öğe varsa true değerini döndürür.
        //Stream boşsa veya eşleşen öğe yoksa false değerini döndürür.
//        System.out.println(list.stream().anyMatch(predicate)); // true

        //allMatch() yalnızca Stream' deki tüm öğelerin verilen Predicate ile eşleşmesi durumunda true değerini döndürür.
        //Stream boşsa true değerini döndürür.
//        System.out.println(list.stream().allMatch(predicate)); // false

        //noneMatch(), yalnızca Stream' deki öğelerin hiçbiri verilen Predicate ile eşlemediğinde true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        //Sonsuz Streamler için sonlandırılanabilir, sonlandırılamayabilir.(verilere bağlıdır.)
//        System.out.println(list.stream().noneMatch(predicate)); // false
//
//        // infinitive
//        System.out.println(infiniteQ1.anyMatch(predicate)); // true
//        System.out.println(infiniteQ2.allMatch(predicate)); // true -> endless loop

//        System.out.println(infiniteQ2.noneMatch(predicate)); // false

        //foreach() pipeline ' daki terminal işlemidir.

//        Stream<String> s01 = Stream.of("Monkey", "Gorilla", "Chimp");
////        s01.forEach(System.out::println);
//
//        List<String> list01 = new ArrayList<>();
//        s01.forEach((str) -> {
//            String supper = str.toUpperCase();
//            list01.add(supper);
//        });
//        System.out.println(list01);

        //forEach()
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.forEach(number -> System.out.println(number * 2));
//        System.out.println(numbers);
//
//        // map()
//        List<Integer> mappedNumbers = numbers.stream()
//                .map(number -> number * 2)
//                .map(number -> number * 2)
//                .collect(Collectors.toList());
//        mappedNumbers.forEach(System.out::println);
//        mappedNumbers = mappedNumbers.stream().map(number -> number * 2).collect(Collectors.toList());
////        .stream()
////        .map(number-> number *2)
////        .collect(Collectors.toList());
//        System.out.println(mappedNumbers);

//        Stream<Integer> stream = Stream.of(3, 5, 6);
//        Stream<Integer> stream4 = Stream.of(3, 5, 6); // boş olursa Optional.empty çıktısı verir.
//
//        System.out.println(stream.reduce(10, (a, b) -> a*b));
        // 10,3 -> 10 * 3 => 30, a=30
        // 30, 5 -> 30 * 5 => 150, a=150
        // 150, 6 -> 150 * 6 => 900, a = 900
        // 900, null -> girmiyor => return a
//        System.out.println(stream4.reduce((a, b) -> a * b));
        // 3, 5 -> 3*5 => 15, a = 15
        // 15, 6 -> 15 * 6 => 90, a=90
        // 90, null -> girmiyor => return a
//        List<Integer> intList = List.of(3, 5, 6);
//        int a = 0;
//        int b = 0;
//        int total = 0;
//        for (int i = 0; i < intList.size(); i++) {
//            if (i == 0) {
//                a = intList.get(i);
//            } else {
//                a = total;
//            }
//
//            if (i != intList.size() - 1) {
//                b = intList.get(i + 1);
//            } else {
//                total = a * b;
//                System.out.println(total);
//                break;
//            }
//            total = a * b;
//        }
//
//        Optional<Integer> total2 = Optional.of(1);
//
//        if(intList.size() == 0){
//            System.out.println(Optional.empty());
//        }else{
//            for (int i = 0; i < intList.size(); i++) {
//                total2 = Optional.of(total2.get() * intList.get(i));
//            }
//            System.out.println(total2
//            );
//        }

//        Stream<String> stream03 = Stream.of("w1", "o2", "l3", "f4");
//        String word = stream03.reduce("X", String::concat);
////          String word = stream03.reduce("X", (x,y) -> x.concat(y)); // Bu şekilde de yazılabilir.
//        System.out.println(word);
//
//
//        Stream<String> stream04 = Stream.of("w", "o", "l", "f");
//        String word2 = String.valueOf(stream04.reduce((c, d) -> c + "--" + d));
//        System.out.println(word2);

//        String frencgCounting = "un:deux:deux:quatre";
//        List<String> gmailList = Arrays.stream(Pattern.compile(":")
//                .split(frencgCounting)).collect(Collectors.toList())


//        List<String> gmailList2 = List.of(frencgCounting.split(":"));
//        System.out.println(gmailList2);
//
//        Set<String> gmailSet = Pattern.compile(":")
//                .splitAsStream(frencgCounting).collect(Collectors.toSet());
//        System.out.println(gmailSet);
//
//
//        //collect(Collectors.toMap())
//        Map<String, Integer> nameLength = Stream.of("Albus", "Percival", "Wulfric", "Brian", "Dumbledore")
//                .collect(Collectors.toMap(name -> name, String::length));
//        System.out.println(nameLength);
//
//        Optional<String> name = Stream.of("Albus", "Percival", "Wulfric", "Brian", "Dumbledore")
//                .reduce(String::concat);
//
//
//        Map<String, Integer> nameLength2 = Stream.of(name.get())
//                .collect(Collectors.toMap(name2 -> name2, String::length));
//        System.out.println(nameLength2);

        //StringBuilder();
//
//        Stream<String> stream05 = Stream.of("w", "o", "l", "f");
//        StringBuilder word3 = stream05
//                .collect(StringBuilder::new
//                        //(a,b)
//                        , StringBuilder::append
//                        , StringBuilder::append);
//        System.out.println(word3);
//
//        //TreeSet()
//        Stream<String> stream06 = Stream.of("w", "o", "l", "f");
//        TreeSet<String> set = stream06.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set);
        }
    }

