package week02;

public class SingleOperator {
    public static void main(String[] args) {
        // Degisken Tanımlaması:
        int number1 = 87, number2 =13;
        boolean condition = true;
        // On Arttırma ve Azaltma Operatoru:
        System.out.println("(A) Degeri: "+ number1 + "\t(++A) Degeri: "+ (++number1));
        System.out.println("(B) Degeri: "+ number2 + "\t(--B) Degeri: "+ (--number2));
        // Sonrası Artıs Azaltma Operatoru
        System.out.println("(A) Degeri: "+ number1 + "\t(A--) Degeri: "+ (number1++));
        System.out.println("(B) Degeri: "+ number2 + "\t(B++) Degeri: "+ (number2--));

        System.out.println("A degeri = " + number1 + " B degeri = "+ number2);
        //Mantıksal Degıl operatoru
        System.out.println("Degil (!): "+ !condition);
        System.out.println("Degil (!): "+ condition);
    }
}
