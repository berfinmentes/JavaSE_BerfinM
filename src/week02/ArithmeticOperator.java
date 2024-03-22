package week02;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int number1 = 25, number2 = 3, number3 = 17;
        String websiteName = "Web Sitemiz: ", websiteUri = "www.bilgeadam.com";

        //Stringlerde Ekleme Operatoru Kullanırsak:
        System.out.println("Merhaba!\n"+(websiteName + websiteUri + " \nSitemizi ziyaret edin!"));

        //Ekleme - Cikarma operatorleri:
        System.out.println("A + B ="+ (number1 + number2));
        System.out.println("A - C ="+ (number1 - number3));

        // Carpma ve Bolme Operatorleri
        System.out.println("A * B = " + (number1 * number2));
        System.out.println("A / 5 = " + (number1/5) );

        //Mod Alma Operatoru
        System.out.println("C % B = " + (number3%number2));

        System.out.println((2+5));
    }
}
