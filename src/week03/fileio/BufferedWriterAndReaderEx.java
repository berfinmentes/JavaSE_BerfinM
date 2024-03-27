package week03.fileio;

import java.io.*;

public class BufferedWriterAndReaderEx {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("buffered.txt");  /*output*/
        BufferedWriter bw = new BufferedWriter(fw);/* FileWriter ile çalışmak için Buffered Writer türüne ihtiyaç vardır */
        bw.write("hello");
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.close();
        fw.close();


        FileReader fr = new FileReader("buffered.txt"); /* Satır Okur*/
        BufferedReader br = new BufferedReader(fr);


        /*BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));*/

        String data= null;
        while((data = br.readLine())   != null){
            System.out.println(data);
        }
        fw.close();
        br.close();
    }
}
