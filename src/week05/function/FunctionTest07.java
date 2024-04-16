package week05.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionTest07 {
    public static void main(String[] args) {

        Function<String, Integer> textLength = String::length;
//        System.out.println(textLength.apply("Test"));
//        textLength.apply("Test");
//        Function<Integer, Integer> kare = a -> (int) Math.pow(a, 2);
        Function<Integer, Integer> kare = a -> a*a;
//        System.out.println("Metin uzunluk karesi : " + kare.apply(textLength.apply("Test")));
//        kare.apply(kare.apply(textLength.apply("Test")));

        Function<String, Integer> combinedFuntion = textLength.andThen(kare);
        System.out.println(combinedFuntion.apply("Mert"));
    }


}
