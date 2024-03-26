package week03.exceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        int number1 = 5;
        int[] array = new int[3];
        try {                 /* Hata burda yakalanır  */
            System.out.println(array[3]);
            System.out.println((number1 / 0));
            System.out.println("try blok içi");

        }catch (ArithmeticException e) {   /* Burda denetlernir */  /* ArithmeticException */
            System.out.println("Caught ArithmeticException! ");


        }catch (Exception e){
            System.out.println("Caughht Exceptions");

        } finally {  /* hata olsa bile finally blogunda girilen kod çalışır */
            System.out.println("merhaba");
            System.out.println("Dünya");


        }
        System.out.println("Kodun Bitişi");
    }
}
