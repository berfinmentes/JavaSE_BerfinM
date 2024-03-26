package week03.exceptions;

public class HandlingExceptions2 {
    public static void main(String[] args) {

        String name = null; /* null = tanımlanmış bir değer yok */
        //name.toUpperCase(); /*  name boş olduğu için toUpperCase çalışmıyor*/

        try {
            name.toUpperCase(); /* Hatayı veren kodu try bloguna al!!! */

        }catch (NullPointerException e ){
            e.printStackTrace(); /*try-chatch' e almazsak görünecek hatayı konzola yazdırır (Detaylı*/
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println("Caught NPE");
        }finally {
            System.out.println("finally block");
        }

        }


    }

