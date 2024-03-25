package week03.methods.staticmethods;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        int sayi1 =15;
        int sayi2 =20;
        StaticVsNonStatic staticVsNonStatic = new StaticVsNonStatic();
        System.out.println(addNumbers2(sayi1,sayi2));
        System.out.println(staticVsNonStatic.addNumbers1(sayi1,sayi2));
        System.out.println(staticVsNonStatic.addNumbers2(sayi1,sayi2));

    }
    //Method 1
    public int addNumbers1(int a, int b){
        int sum = a+b;                   //sum==int
        return sum;
    }
    //Method 2
    public static int addNumbers2(int a, int b){
        return a+b;
    }
}
