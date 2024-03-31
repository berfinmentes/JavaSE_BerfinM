package week03.oop.principles.inheritance;

public class Triangle extends Shape{
    private double base;
    private double height;

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a triangle");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();



    }
}
