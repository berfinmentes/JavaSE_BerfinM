package week03.oop.principles.inheritance;

public class MainShape {
    public static void main(String[] args) {

    }
    Circle circle = new Circle();

    public void setCircle(Circle circle) {
        this.circle = circle;
        System.out.println("Radius : "+circle.getRadius());
    }

    Rectangle rectangle = new Rectangle();
    public void setRectangle(){
        this.rectangle = rectangle;
        System.out.println("Width : "+rectangle.getWidth());
        System.out.println("Height : "+rectangle.getHeight());

    }
    Triangle triangle= new Triangle();
    public void setTriangle(){
        this.triangle = triangle;
        System.out.println("Base : "+triangle.getBase());
        System.out.println("Heigt : "+triangle.getHeight());

    }
}
