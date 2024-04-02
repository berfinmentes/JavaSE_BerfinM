package week04.finalexamples.ornek02;

public class Main extends FinalMethodExample02{
    /*Bunu kullanamayız çünkü superclassda final olarak tanımlanış*/
    /*@Override
    public final void display(){
        System.out.println("This is a final method");
    }*/

    /*Overload ederk kullanabiliriz*/

    public final void display(String name){
        System.out.println("This is a final method");
    }


    @Override
    public void sayHello() {
        System.out.println("Hello Java Class");
    }
}
