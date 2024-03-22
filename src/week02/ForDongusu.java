package week02;

import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {

        /* Kullanıcıdan Veri Alma
        - scanner.nextInt(), scanner.nextLong(), scanner.nextDouble()
        -scanner.nextFloat(), scanner.nextLine();*/

        Scanner scanner = new Scanner(System.in);
        // Scanner Sınıfını Kullanıcıdan Veri almak için Kulllan
        {

            int sayi; // Değişken Tanımla
            System.out.println("Lütfen bir tamsayi giriniz "); //Kullacıdan Değer Al
            sayi = scanner.nextInt(); // İstediğin Sayıyı "İnt" (Tam Sayıya) Dönüştür. int tanımladığın için int değişebilir
            for (int i = 1; i < sayi; i++) { //i değişkenini Oluştur ve Sayıya Eşit Olana Kadar Arttır
                if (i % 2 == 0) { // Mod al
                    System.out.println(i);// Yazdır
                }
            }
        }
    }
}








