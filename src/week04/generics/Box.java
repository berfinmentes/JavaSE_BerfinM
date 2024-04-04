package week04.generics;

public class Box <T>{
    private T item;

    public void addItem(T item) {       /*Generic Method örneği*/
        this.item = item;
    }
    public T getItem(){
        return item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Merhaba Dünya ! ");
        String message = stringBox.getItem();
        System.out.println("\nMessage : "+message);

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(42);
        int number = integerBox.getItem();   /*Auto UnBoxing*/
        System.out.println("\nSayi : "+number);

    }
}
