package week03.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        //FileWriter fw = new FileWriter("file.txt"); Başlangıç değişkeni
        try {
            FileWriter fw = new FileWriter("file.txt"); /*Hata */
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Veri Transverinde bir sorun oluştu");
        }
        /*}catch (Exception e){
        -> Exceptin girilirse hata adresini tanımlayamazdsın.
        Konsolda çıkan hatayı "catch" bloguna gir. BSP:"catch (IOException e)"
            e.printStackTrace();*/

        }
    public void throwsExample() throws IOException{
        FileWriter fw = new FileWriter("file.txt");
        }

    }

