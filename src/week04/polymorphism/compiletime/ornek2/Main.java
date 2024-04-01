package week04.polymorphism.compiletime.ornek2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result1 = cal.sum(1,2);
        int result2 = cal.sum(2,3);
    }
}
