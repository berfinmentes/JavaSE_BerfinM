package week02;

public class AssigmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 327;
        int intNumber = 1058;
        long longNumber = 12042;
        float floatNumber = 42.8f;
        double doubleNumber= 8.58;
        char character = 'A';
        boolean booleanInformation = true;

        // Referans Veri Tipleri ( String ile sınırlı):
        String myText="Merhaba !" , myWeb= "www.bilgeadam.com";
        // Ekrana Yazdırma Komutlları:
        System.out.println(myText
                +"\nByte Degeri: " +byteNumber
                +"\nShort Degeri:" +shortNumber
                +"\nInteger Degeri: "+intNumber
                +"\nLong Degeri: "+longNumber
                +"\nFloatDegeri: " + floatNumber
                +"\nDouble Degeri: "+doubleNumber
                +"\nChar Degeri: " +character
                +"\nBoolean Degeri: "+booleanInformation);
        System.out.println(myWeb);




    }
}
