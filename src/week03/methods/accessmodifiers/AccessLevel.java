package week03.methods.accessmodifiers;

public class AccessLevel {

    //Global+Subclass+ Package+ Class
    public String publicString() {
        return "public string";

        //Class
    } private String privateString(){
        return "private string";

        // Subclass+ Package+ Class
        // == Yeni sınıfın bi uzantusu olduğunda açılır.
        // Bunun için sınıf adının yaına "extends + Metodun "olduğu sınıf
    } protected String protectedString(){
        return "prıtected string";

        //Package+ Class
    } String defaultString(){
        return "default string";
    }

    /* Static Methodun içerisine Nonstatic değer doğrudan çağırılamaz.
    Çağırmak için önce Methodun bulunduğu sınıfın bir nesnesini oluşturmamaız gerekir.*/



}
