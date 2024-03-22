package week02;

public class NestedForLoop2 {
    public static void main(String[] args) {
        for( int i =1; i<=5; i++){
            for(int j =1; j<=i; j++ ){
                System.out.print(" *"); //For (j)
            }
            System.out.println(); // Alt Satıra Geçirir (for i)
        }
    }
}
