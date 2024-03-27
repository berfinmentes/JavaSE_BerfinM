package week03.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("printWriter");  /* FLUSH VE CLOSE UNUTMA!!!*/
        pw.println("HELLO");
        pw.println("BERFİN");
        pw.println();
        pw.println("JAVA");
        pw.flush();
        pw.close();
    }
}
