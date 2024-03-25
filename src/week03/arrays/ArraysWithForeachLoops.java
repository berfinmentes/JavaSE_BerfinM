package week03.arrays;

import java.sql.SQLOutput;

public class ArraysWithForeachLoops {
    public static void main(String[] args) {

        //For Each ile Array'de gezinmek

        int[] ages = {12, 5, 14, 13}; // Kod çoklu veri barındırıyorsa İsimlendirmede Çoğul olduğunu belirtrmek önemlidir
        for (int age : ages) { // age yerine girilecek isim önemsizdi
            System.out.println(ages);

            int[] agesA = {12, 5, 14, 13};
            for (int x : agesA) {
                System.out.println(x + 1);
            }
        }


    }
}


