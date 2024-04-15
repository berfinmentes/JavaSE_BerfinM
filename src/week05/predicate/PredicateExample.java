package week05.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("a");
        /* 1 tane parametre alıyorsa ve veri türü belirtmediysek paranteze gerek yok*/

        Predicate<String> predicate2 = (String element) -> element.startsWith("a");
        /*Veri türü belirttiğimiz için parantez gerekli*/

        Predicate<String> predicate3 = (String element ) -> {
            return element.startsWith("a");
        };
        /*Yukarıdaki 3 predicate kullanımıda aynı anlama gelir, aynı şekilde çalışır */

        Stream.of("java", "alperen", "python", "ali", "hello").filter(predicate1).forEach(System.out::println);/*f,ilter ile sorgu yaptık. */
    }
}
