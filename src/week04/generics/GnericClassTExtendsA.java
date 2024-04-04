package week04.generics;

public class GnericClassTExtendsA <T extends Number>{
    public void display(){
        System.out.println("This is a bounded type generic class. ");
    }
    public static void main(String[] args) {


       // GnericClassTExtendsA<String> stringObj = new GnericClassTExtendsA<String>();
        /*Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'*/

        GnericClassTExtendsA<Integer> intObj = new GnericClassTExtendsA<Integer>();

    }
}
