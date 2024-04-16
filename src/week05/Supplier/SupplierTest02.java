package week05.Supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {

    // public static<T> Stream <T> generate(Supplier<? extends T>
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = () -> new Random().nextInt(5);
        Stream.generate(supplier01).limit(10).forEach(System.out::println);


        // ODEV : Aşağıdaki kod yapısını metotlar kullanarak uygulayın.
        System.out.println("---------------------");
        Supplier<Integer> supplier02 = new Random()::nextInt;
        Stream.generate(supplier02)
                .limit(3)
                .forEach(System.out::println);

        Supplier<Integer> supplier03 = SupplierTest02::createRandomNumber;
        System.out.println(supplier03.get());

    }

    public static Integer createRandomNumber(){
        return new Random().nextInt();
    }


}
