package week04.abstraction.ornek02;

public abstract class Shape {
    public abstract double calculateArea();  /*abstrackt olduğu için gövdesiz*/
    public static void draw(){
        System.out.println("Bu bir Shape");
    }
}
