package week03.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        FileWriter flieWriter = null;

        //fliewriter = new FileWriter("fileWriter.txt"); /*txt metin belgeesi */
        try {
            flieWriter = new FileWriter("fileWriter.txt");
            flieWriter.write("Merhaba File! ");
            flieWriter.write("abc ");
            flieWriter.write("\nabc ");
            flieWriter.write("\r\n");
            flieWriter.write("nextLine\t");
            flieWriter.flush(); /* Flush */
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
                if (flieWriter != null) {
                    flieWriter.close();


                }

            }
        FileReader fileReader = new FileReader("fileWriter.txt");
        int i;
        while((i=fileReader.read())!=-1){  /* -1 Çıkış için kullandın */
            System.out.print((char)i);
        }
        fileReader.close();
        }
    }


