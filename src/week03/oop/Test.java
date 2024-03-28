package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className1 = new ClassName();  /* ClassName sınıfının nesnesdini oluşturduk*/
        System.out.println( className1.sayHello("\nBerfin")); /*Nesnesini oluşturduktan sonra o sınıfta oluturduğumuz methodu kullanabiliriz*/
        System.out.println(className1.sum(1,5));

         ClassName className2 = new ClassName();
        System.out.println(className2.sayHello("\nBerfin"));  /*Aynı sınıftan birden farklı nesne oluşturabilirsin */
        System.out.println(className2.sum(1,5));



         Person p1 = new Person();
         p1.name= "Berfin";
         p1.gender = "Frau";
         p1.nickname = "Lieber Frau";
         p1.walk();
         p1.sleep();


         Person p2 = new Person();
         p2.name= "Aylin";
         p1.gender= "Frau";
         p2.walk();
         p2.sleep();
        System.out.println(p1.nickname);



    }
}
