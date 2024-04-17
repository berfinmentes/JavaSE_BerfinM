package week05.exception.trywithresources.suppressedexception;

public class Computer implements AutoCloseable {
    public void run() {
        System.out.println("Computer is running...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Shut down...");
        throw new IllegalStateException("Exception is closed");
    }


}
