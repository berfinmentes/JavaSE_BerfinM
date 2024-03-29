package week03.methods;

//public class PrimeNumberCalculator {
    //long number;
    /**/


    /**/
    /**/

    //boolean PrimeNumberCalculator() { /*<---(Parametre/ Argüman) kısmı burasıdır buraya String, int gibi değerler verilir */
        //..

       // PrimeNumberCalculator();
        /*Bu sınıfın bir nesnesi oluşturulurken dışardan bir sayının parametre olarak girilmesi durumunda,
         * bu constructor çalışacaktır.Yukarıda parametre olarak atadığım numbe değişkenini bir alt satırda
         * number isimli field'ıma değer olarak atıyorum.Bu şekilde olan constructorlara Parametreli constructor
         *  (Parameterized Constructor) denir. Argüman olarak nesne üretmek için kullanılır */
        //this.number = number; //Buradaki this. ifadesi sınıfın değişkeni olan numbera seslendiimi ifade eder


        //public/*access modifier*/ boolean/*geri dönüş tipi*//*metot ismi*/ /*parametre alanı*//*
        /*{/*Metot gövdesi*/
        // if (number == 2) {
        //   return true;
        //} else if (number < 2 || number % 2 == 0) { /*Birbirine bağlı */


   /* Long Number dediğimiz deĞişken PrimeNumberCalculator sınıfının bir field'ı dır.
    Long değişkeninin veri türünü, number ise değişkene verdiğimiz ismi ifade eder.
     Değişkenin veri türü herhangi bir primitive type, yada herhangi bir class olabilir;

      ÖRN--> Scanner scanner = new Scanner(System.in);
      burada veri türü soldak,, Scanner class'ıdır. "scanner ise" oluşturduğumuz değişkene hangi
       ismimle sesleneceğimiz belirtir.Sağ tarafta ise atama operatörü(=) aracılığıyla değikenimize
       atadığımız değeri barındırıyor.
       new Scanner(System.in)--> ifadesi aslında Scanner sınıfının bir yapucu metotudur.
       Scannetr yapıcı metodu içerisinde System.in türünde bir parametre almadan benim için bir
        scanner nesnesi oluşturmuyor.
        Bir sınıf içerisinde sonsuz sayıda field/attribute barındirabilir.
        Dikkat edilmesi geren tek şey bu fieldların birbiriyle çakışmamasıdır.

        Bir field yada  sıradan bir metot nasıl isimlendirilir?
       ->İlk kelimenin baş harfi küçük başlar
       -> Sonrasındaki bütün kelimelerin ilk harfi büyük harfle yzılır.
             String plakanNo
       -> İlk kelimenin ilk hari küçük başlar, sonrasındaki bütün kelimelerin ilk harfi büyük
         yazılır.Bu sayede boşluk tuşu kullanmadan (space) kelimeleri birbirinden ayırt etmiş oluruz.
          public int sayiTopla ( int sayi, int sayi)
       -> BU sıradan bir metot olduğu için isminin ilk harfi küçük başlar.  */

        /*1- Constructor metodun ismiyle aynı olmalı
         *2-Parametreler için () uygulanmalı bu sayede metod olduğu jvm tarafından algılanır
         * 3-Consturctor metotlarında geri dönüş tipi olmadığı için normal metotların aksine geri dönüş tipi
         * 4-belirtilmez, dolayısıyla herhangi bir koşulda "return" de kullanılmaz
         * geri dönüş tipi olmasada, Access Modifier kullanabiliriz
         *  4.1-Access Modifierlarım; public, private, protected, default
         *    4.1.1 - Access modifier public ise ilgili metot/field yada classa projenin herhangi bir yerinden erişebilirim
         *    4.1.2 - Access modifier private ise ilgili metot/field yada field'a sadece metot field'ın tanımlandığı sınıfta erişebilirim
         *    4..1.3 - Access Modifier default ise(yani hiç birşey belirtilmadiyse- kendikliğinden default olur.)
         *      metot ve field'lara sadece bulundukları sınıf ile aynı pakette bulunan diğer sınıflar erişebilir.
         *    4.1.4 - Access Modifier protected ise default özelliklerine ek olarak,kalıtım durumu var ise metot ve fieldlara başka paketlerden erişilebilinir
         * 5-Her metot da olduğu gibi Constructor metodununda gödesi "{} olmak zorundadır
         * 6-Constructor metodu sınıfın yapıcı metodudur, sınıfın bir nesnesini yaratmak için kullanılır
         * */
    /*Hiç birşey yazılmadğı için axxess modifier'ı default oldu. Dolayısıyla bu constructor
    metoduna sadece bu sınıfın bulunduğu pakette bulunan sınıflar erişebilir.*/


