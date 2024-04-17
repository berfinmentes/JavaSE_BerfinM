package week05.exception.trywithresources.autocloseable;

public class Computer implements AutoCloseable {
    public void run(){
        System.out.println("Computer is running...");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Akış kapatıldı.");
    }


}
