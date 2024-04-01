package week03.oop.principles.inheritance.ornek02;

public class Circle extends Shape{
    double radius;

    Circle(String color, double radius){
        super(color);
        this.radius =radius;


    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a shape");
    }
    double calculateArea(){
       // return Math.PI/radius*radius;
        return Math.PI*Math.pow(radius,2);

    }

}
