package week03.constructor;

/*Bu sınıfın içerisinde bir isim, soyisim ve üle fieldları olsun. Ülke fieldını içeriden atayan.
 * bir parametresiz constructor oluştur.
 * Ülke değeri bir nesne oluşturması durumunda direkt olarak Türkiye değeri alsın
 * Sonrasında bu sınıftan 3 adet nesne üretip, isim soyisim bilgilerini doldurup
 * üleklerinin konsol çıktılarını alalım*/

import week03.oop.Person;

public class NoArgsConstructor {
    private String name;
    private  String lastname;
    private String land;

     NoArgsConstructor(){
        land = "Turkey";

    }

    public static void main(String[] args) {

        NoArgsConstructor obj1 = new NoArgsConstructor();
        obj1.name ="Berin";
        obj1.lastname ="Menteş";
        NoArgsConstructor obj2 = new NoArgsConstructor();
        obj2.name="Alperen";
        obj2.lastname="İkinci";
        NoArgsConstructor obj3 = new NoArgsConstructor();
        obj3.name= "Aylin";
        obj3.lastname="Çelikdemir";


        System.out.println("Kişinin Adı : "+obj1.name);
        System.out.println("Kişinin Soyadı : "+obj1.lastname);
        System.out.println("Kişinin Ülkesi : "+obj1.land);
        System.out.println();
        System.out.println("Kişinin Adı : "+obj2.name);
        System.out.println("Kişinin Soyadı : "+obj2.lastname);
        System.out.println("Kişinin Ülkesi : "+obj2.land);
        System.out.println();
        System.out.println("Kişinin Adı : "+obj3.name);
        System.out.println("Kişinin Soyadı : "+obj3.lastname);
        System.out.println("Kişinin Ülkesi : "+obj3.land);

    }
}
