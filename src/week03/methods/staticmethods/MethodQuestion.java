package week03.methods.staticmethods;

import java.util.Scanner;

public class MethodQuestion {
    /* girilen bir tam sayının karesini alan bir method oluştutralım,bu method non-static olsun.
    Daha sonra Kullanıcıdan İki adet sayı isteyelim. Bu sayılardan küçük olandan başlayarak
     büyük olanına kadar arasındaki bütün sayıların karesini method yardımıyla alalım
     */


    public static void main(String[] args) {

        //Non-static bir method olduğu için önce methodun nesnesini oluştur
        // MethodQuedtion()-> Yapıcı Method Olduğu için baş harfi büyük yazılır
        MethodQuestion methodQuestion = new MethodQuestion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1.sayı giriniz");
        int num1 = scanner.nextInt(); //-> scanner.nextInt() +"\;
        scanner.nextLine();
        System.out.println("Lütfen 2.sayı giriniz");
        int num2 = Integer.parseInt(scanner.nextLine()); //Integer.parseInt("\n)


        int min;
        int max;

        /*min = Math.min(num1,num2) ;
        max = Math.max(num1,num2);
        System.out.println(min);
        System.out.println(max);*/

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        for (int i = min; i <= max; i++) {
            System.out.println(methodQuestion.getSquare(i));
        }

        long square = methodQuestion.getSquare(5);
        System.out.println(square);


    }



    public long getSquare(int number) {
        //return (long) Math.pow(number,2); // "Bu method da çalışır, ama daha yavaş işler. Sayılar ikiden fazla olursa bu method daha mantıklıdır
        return number * number;


        //public long getPower(int number, int power){
        //number = number -1;
        //if(return ==0){
        //return 0;
        //return (long) Math.pow(number,2);

    }
}









