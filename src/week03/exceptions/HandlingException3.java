package week03.exceptions;

public class HandlingException3 {
    public static void main(String[] args) {
        String name = null;   /*Başlangıç değerleri*/
        //name.toUpperCase();  /*
        if(name==null){  /* Girilen değerin "null olmadığından emin olunur*/
            System.out.println("lütfen bir isim giriniz!");
        } else{
            System.out.println(name.toUpperCase());
            // name.toUpperCase(); Hata çözüldükten sonra işlem gerçekleştirilir

        }

    }

}
