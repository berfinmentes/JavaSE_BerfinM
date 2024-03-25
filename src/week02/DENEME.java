package week02;

import com.sun.tools.javac.Main;

public class DENEME {
    public static void main(String[] args) {
        /*for( int i =1; i<=7; i++){
            for(int j =1; j<=i; j++ ){
                System.out.print(" *");
            }
            System.out.println();
        }
        for( int i =1; i<=7; i++){
            for(int j =7; j>=i; j++ ){
                System.out.print(" *");
            }
            System.out.println();*/
        int toplam=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){

                if(i%j==0){

                    toplam=toplam+j;
                }

            }
            if(toplam==i){

                System.out.println(i+ " Sayısı Bir Mükemmel Sayıdır.");
            }
            toplam=0;


        }
        }
    }

