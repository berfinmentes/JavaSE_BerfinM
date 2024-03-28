package week03.constructor;
/*Ad, soyad, yaş ve cinsiyet fieldlarini belirleyelim. Sonrasında bu sınıfın 2 adet nesnesini
* oluşturalım. Bu nesnelerin yaş ve cinsiyet değerleti, constructor parametrelerinden, oluşturma
*  anında verilsin. Diğer iki değeri elle girelim*/
public class ParameterizedConstructor {
    int age;
    String gender;
    String name;
    String lastname;

    ParameterizedConstructor(int age, String gender){
        /*İsim çakışmsı olacagı için "this" anahtar kelimesini
         kullanarak sınıfımın fieldı olan age e ulaşacağımı bilirtiyorum*/
        this.age = age;
        this.gender = gender;

    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(28,"Erkek");
        obj1.name = "Alperen";
        obj1.lastname = "İkinci";
        System.out.println(obj1.name +
                " "+ obj1.lastname+
                " "+obj1.gender+
                " " + obj1.age);
    }




    }









