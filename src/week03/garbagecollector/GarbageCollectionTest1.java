package week03.garbagecollector;

public class GarbageCollectionTest1 {
    private Object name;

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name ="Eşek";

        Animal animal2 = new Animal("Ayı");
        System.out.println(animal1.name+"->  "+animal2.name);
        System.out.println(animal1.name+"-> Eşek"+animal2.name+"\n ->Ayı");






    }
}
