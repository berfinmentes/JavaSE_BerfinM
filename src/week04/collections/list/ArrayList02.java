package week04.collections.list;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();

        //ArrayList<String> animalList = new ArrayList<>();
        String akrep  = "Akrep";
        animalList.add(akrep);
        String kedi = "Kedi";
        animalList.add(kedi);
        String yilan = "Yılan";
        animalList.add(yilan);

        System.out.println("List : "+animalList);

        String str = animalList.get(1);
        System.out.println("Element index 1 is : "+str);
        int i =0;
        System.out.println("Element at index 0 is : "+ animalList.get(i));



    }
}
