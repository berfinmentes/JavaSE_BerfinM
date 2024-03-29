package week03.oop.principles.encapsulation;

public class Note {

    /**Encapsulation(Kapsülleme) ile metotları, fieldları vs korumaya almış oluruz.
     * Bu nedenle private olurlar.
     * Getter = Field'ın değerini görüntüler
     * Setter = Değer ataması yapar
     *
     * -Kurallar-
     * Instance vareible'lar private olmalıdır
          -->  örn= private int number
     *(Private accessler sadece bulunduğu sınıflarda kullanılırlar)
     * Metotlar içeride kullandıkları bileşenlere uygun olmalıdır.
     * Generate -> Getter and Setter-> Instance vareible seç
     *set... ---> değer ataması yapar
     * get...---> çıktı alır
     --> örn=p1.setName("Alperen"); -- Name' e Alperen ismini atadık
     -->System.out.println("İsim : "+p1.getName() -- Atadığımız ismi yazdırdık
     *Getter and Setter metotları sıralaması;
     * Constructor
     * userDefinedMethods
     * getter-setter methods
     * toString method
     */
}
