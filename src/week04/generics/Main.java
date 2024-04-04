package week04.generics;

public class Main {
    public static void main(String[] args) {
        GenericClas<Integer> intObj = new GenericClas<>(5);
        System.out.println("Generic Class returns : "+intObj.getData());

        GenericClas<String> stringObj = new GenericClas<>("Java Programming");
        System.out.println("Generic Class returns : "+stringObj.getData());



    }
}
