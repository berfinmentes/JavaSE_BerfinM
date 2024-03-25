package week03.arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] strArray = new String[100];
        int[] numbers = new int[30];
        double[] doubleArray = new double[18];

        // Yontem 1
        long[] longArray = {10,15,20};

        //Yontem 2
        long[] longArray2 = new long[3];
        longArray2[0] = 10;
        longArray2[1] = 15;
        longArray2[2] = 20;

        System.out.println("1. eleman : " + longArray2[0]);
        System.out.println("2. eleman : " + longArray2[1]);
        System.out.println("3. eleman : " + longArray2[2]);

        long[] longArray3 =new long[3];
        longArray3[0] = 10;
        longArray3[1] = 15;
        longArray3[2] = 20;
        // Bu şekilde yazdırırlırsa Array'in konumunu gösterir
        //System.out.println(longArray3);
        //System.out.println(longArray2);

    }
}
