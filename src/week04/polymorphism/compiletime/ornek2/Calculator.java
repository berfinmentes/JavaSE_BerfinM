package week04.polymorphism.compiletime.ornek2;

public class Calculator {
    int sum(int a, int b){
        return a+b;
    }
    int sum(double c, int d){
        return (int) (c*d);
    }

}
