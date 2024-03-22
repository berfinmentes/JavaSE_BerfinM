package week02;

public class NestedForLoop3 {
    public static void main(String[] args) { // Asure Tarifi Yap :)

        for( int i =1; i<=7; i++){
            for(int j =1; j<=i; j++ ){
                System.out.print(" *"); //For (j)
            }
            System.out.println(); // Alt Satıra Geçirir (for i)
        }
        for( int i =1; i<=6; i++){
            for(int j =7-i; j>=1; j-- ){
                System.out.print(" *"); //For (j)
            }
            System.out.println(); // Alt Satıra Geçirir (for i)
        }

    }
}
