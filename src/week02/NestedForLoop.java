package week02;

import java.sql.SQLOutput;

public class NestedForLoop {
    public static void main(String[] args) {

        //Carpım Tablosu

        // Birinci(ust) dongu
        for(int i = 1;i<=10;i++){
            // Ikıncı (Alt) Dongu
            for (int j =1; j <=10;j++){
                System.out.println( i + " x "+ j +" = " +(i*j));
            }
        }
    }
}
