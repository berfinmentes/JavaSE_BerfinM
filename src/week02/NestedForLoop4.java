package week02;

public class NestedForLoop4 {
    public static void main(String[] args) {
        int satir = 5;

        for (int i = 1; i <= satir; i++) {
            for (int bosluk = 1; bosluk <= satir - i; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * i - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = satir - 1; i >= 1; i--) {
            for (int bosluk = 1; bosluk <= satir - i; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * i - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

