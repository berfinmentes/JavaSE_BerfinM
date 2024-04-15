package week05.diamond_problem;

public interface MyInterface2 {
    /*default ayarlarda metodun access modifier'ı public olduğu için gri görünüyor*/

    default void defaultMethod(){
        System.out.println("MyInterface defaultMethod");
    }
    /*Interface de varsayılan olarak bütün methotlar abstract gelir. O yüzden gri görünüyör */
    abstract void test();
}
