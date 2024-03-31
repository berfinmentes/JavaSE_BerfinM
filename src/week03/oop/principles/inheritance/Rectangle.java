package week03.oop.principles.inheritance;

public class Rectangle extends Shape{
    public double width;
    public double height;

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a rectangle");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
