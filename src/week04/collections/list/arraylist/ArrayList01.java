package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("List : "+numberList);

        /*Listeden bir elemena erişim*/
        int number = numberList.get(2);  /*Auto Unboxing*/
        System.out.println("Accessed element : "+number);

        /*Listeden bir indexin kaldırılması*/
        int removeNumber = numberList.remove(1);
        System.out.println("Removed Element : "+removeNumber);
        System.out.println("List : "+numberList);
    }
}
