package week04.abstraction.ornek02;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
