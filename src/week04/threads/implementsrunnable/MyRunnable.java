package week04.threads.implementsrunnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("\nRunnable is running");
    }
}