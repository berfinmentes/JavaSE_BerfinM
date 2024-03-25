package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        /*2, -9, 0,5,12,-25,22,9,8,12,sayılarını bir dizi içeisinde tanımla.
          sonra for/foreach kullanarak toplamını bul yazıdr + Ortalama*/

        int[] numberArr = {2, -9, 0,5,12,-25,22,9,8,12};
        int toplam = 0;
        double ortalama =0;
        for(int number : numberArr) {
            toplam += number;
        }
        System.out.println(toplam);
        ortalama =(double) toplam/numberArr.length;
        System.out.println(ortalama);


        //Foreach ile yap
        toplam= 0;
        ortalama=0;











        }
    }

