package week03.oop.principles.inheritance;

public class Dog extends Animal {   /* extends anahtar kelimesiyie Animal sınıfının inheritance oluşturduk*/
    public void display(){
        System.out.println("My name is "+name);
    }
  //  public void  eat(){
     //   System.out.println("Dog can eat");
   //
    //}



    @Override
    public void eat() {
        super.eat(); /* superclass'daki eat () metodu*/
       /* this.eat(); /* bu sınıftaki eat() metodu*/
        System.out.println("I eat dog food");
    }
}

