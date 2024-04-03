package week04.collections.map.hashmap;

import week04.enums.Main;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample05 {
    public static void main(String[] args) {
        TreeMap<String ,Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        evenNumbers.put("Eight",8);
        System.out.println("TreeMap : "+evenNumbers);


        //TreeMap üzerinden hashMap oluşturma
        HashMap<String,Integer> numberHashMap = new HashMap<>(evenNumbers);
        System.out.println("HashMap : "+numberHashMap);

        evenNumbers.put("Four",4);
        evenNumbers.put("Eight",8);
        evenNumbers.put("Six",6);

        String firstKey = evenNumbers.firstKey();
        System.out.println("First Key : "+firstKey);
    }
}
