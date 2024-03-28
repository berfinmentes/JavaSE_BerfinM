package week03.constructor;

public class Main {
    private String name;
    Main(){
        System.out.println("Constructor Called...");
        name = "Constructor name field";
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2 = new Main();/*
        obj.name = "Construcktor name fleid.";
         obj2.name = "Construcktor name fleid.";
         Bu yöntem yerine Constructor tanımlarsan aynı değeri "name = "Constructor name field"  bu kodla tanımlayabiliriz*/
        System.out.println("The name is : "+ obj.name+"\nThe name is : "+obj2.name);
    }
}
