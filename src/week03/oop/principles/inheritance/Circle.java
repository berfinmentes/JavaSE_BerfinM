package week03.oop.principles.inheritance;

public class Circle extends Shape{
    private double radius;

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
        //return super.calculateArea();





    }

}
