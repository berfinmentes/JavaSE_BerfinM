package week04.finalexamples.ornek01;

public class FinalVariableExample01 {
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        final int age = 10;
        System.out.println(age);
       // age =25; age deişkeni final olduğu için bu yeni bir değer atamsı kabul etmez
        System.out.println(age);
    }
}
