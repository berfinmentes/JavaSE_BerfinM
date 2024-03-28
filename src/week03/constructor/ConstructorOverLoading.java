package week03.constructor;

public class ConstructorOverLoading {
    String country;
    String language;
    ConstructorOverLoading(String country, String language){ /*AllArgsConstructor*/
        this.country= country;
        this.language= language;

    }
    ConstructorOverLoading(String country){  /*ParameterizedConstructor*/
        this.country = country;
    }
    ConstructorOverLoading(){ /*NoArgsConstructor*/

    }

    public static void main(String[] args) {

        /*No-args constructor şuan herhangi bir constructor tanımlamadığı için default constructor
         olarak bana no-args- constructor Java tarafından geliyot*/
        ConstructorOverLoading obj1 = new ConstructorOverLoading();
        obj1.country = "Turkey";
        obj1.language= "Turkish";
        System.out.println(obj1.country+" "+obj1.language);
        /*
        * 1. de NoArgsConstructor kullandık. İki field'ın değerini de
        * nesneyi oluşturduktan sonra, ayrı ayrı atadık
        * Nesneyi oluşturuken içini doldurmadık*/


        ConstructorOverLoading obj2 = new ConstructorOverLoading("Germany");
        obj2.country ="Germany";
        obj2.language = "German";
        System.out.println(obj2.country+" "+obj2.language);
        /*
        * 2.de ParameterizedConstructor kullandık Field'lardan birinin değerini nesneyi
        * oluştururken argüman olarak verdik.diğerini ise nesneyi oluşturduktan sonra
        * dışarıdan atamasını yaptık */
        ConstructorOverLoading obj3 =new ConstructorOverLoading("England", "Englisch");
        System.out.println(obj3.country+" "+obj3.language);

        /*3. de bütün fieldlari Parameterized Constructor ile aldık. Dolayısıyla dışarıdan değer
        ataması yapmaya gerek kalmadı. Nesneyi oluştururken içini doldurdu
        1. si 0 parametre aldığı için noArgsConstructor. 3, ise AllArgsConstructor*/
    }
}
