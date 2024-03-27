package week03.oop;

public class Person {
    /*Nesne oluşturmak için açılan sınıfta main methodu eklenmez*/
    String name;
    String nickname;
    String gender;



    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void walk (){
        System.out.println(name + " is walking");
    }
}
