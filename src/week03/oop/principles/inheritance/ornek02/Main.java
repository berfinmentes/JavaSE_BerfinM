package week03.oop.principles.inheritance.ornek02;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("pink", 10 );
        circle.draw();
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle("red", 10,5);
        rectangle.draw();
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle("white",3.72,7.53);
        triangle.draw();
        System.out.println(triangle.calculateArea());


    }
}
