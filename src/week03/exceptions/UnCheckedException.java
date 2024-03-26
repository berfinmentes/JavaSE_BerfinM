package week03.exceptions;

public class UnCheckedException {

    //-> Runtime hataları yani çalışma zamanında gerçekleşen hatalar.
    public static void main(String[] args) {
        String name = null;

        /* Kötü Yaklaşım
        try {
            if (name.equals("alperen")) {
                System.out.println("name : alperen");
            }

        }catch (NullPointerException e){
            System.out.println("Catch !");
        }*/
        /**if(name.equals("alperen") && name != null){ /* NullPointerException hatası verir. Soldan okumaya başlar
        . Solda soorun varsa sağdaki koduda çalıştırmaz */

        /**if(name != null && name.equals("alperen"))
            System.out.println("name : alperen");*/

        if("alperen".equals(name)) {     /*Referasnı var */
            System.out.println("name : alperen");

            //->Referansı olmayan boş bir obje referansı olanla eşlenmez
            /*  if(name.equals("alperen")){ -
             System.out.println("name : alperen");    */ //->Referansı olmayan boş bir obje referansı olanla eşlenmez

            /* Herhangi biir objeye hiçlik değerini vermek için "null" kullanılır
             * Scanner scanner = null
             * String name = null
             * (int vb ' de kullanılmaz !!!! Sadece objelerde!!!!    */


        }
    }
}








