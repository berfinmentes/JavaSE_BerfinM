package week03.exceptions;

public class UnChaughtException {
    public static void main(String[] args) {
        UnChaughtException unChaughtException = new UnChaughtException(); /**/
        String name = null;
        unChaughtException.method1(name);
    }

    public void method1(String name) {
        System.out.println("Method1");
        /*try {
            method2(name);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE");
        }*/
        System.out.println("Method worked!");
    }

    private void method2(String name) {
        System.out.println("Method2");
        method3(name);
        /*} catch (NullPointerException e) {
            System.out.println("NPE");*/
        System.out.println("Method didn't work!");
    }

    private void method3(String name) {
        System.out.println("Method3");
        try {
            name.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }
           /* name.toLowerCase(); /* Hata Burada */
            System.out.println("Method3 didn' work");
        }
    }

