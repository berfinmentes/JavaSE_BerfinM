package week02;

public class TypeCasting {
    public static void main(String[] args) {
        int dollar = 5;
        float dollarF = dollar;
        long dollarL = dollar;

        System.out.println(
        "\ndollar Degeri " +dollar
        +"\ndollarF Degeri " +dollarF
        +"\ndollarL Degeri " +dollarL );

        float floatDollar = 13.5f;
        int intDollar = (int) floatDollar; // (int) float-> int !!!

        System.out.println("floatDollar : " + floatDollar+
                "\nintDollar : " + intDollar) ;

        


    }
}
