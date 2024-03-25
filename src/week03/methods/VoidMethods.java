package week03.methods;

public class VoidMethods {
    public static void main(String[] args) {

        // Metodun adı yaptığı işleve uygun olacak, örneğin sayHello metoduyla int hesaplama yapılamaz!!


        sayHello("Berfin");
        //sayHello("Bilge Adam"); // ikinci bir isim değişikliği için method  bir daha çagırılır
        methodRankPoints(224.5);
        methodRankPoints(201.7);
    }
    public static void sayHello(String username){  // void dönüş tipidir. void dönüş parametresizdir(hiçlik)
        System.out.println("MERHABA "+ username.toUpperCase()+ " :) HOŞGELDİN  ");

    }
    public static void methodRankPoints(double points){
        if(points>= 202.5) {
            System.out.println("NOTE  : A1");
        } else if(points >= 122.4) {
            System.out.println("NOTE :  B1");
        } else {
            System.out.println("NOTE :  A3");
        }
    }
}
