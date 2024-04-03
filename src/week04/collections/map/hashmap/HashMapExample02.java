package week04.collections.map.hashmap;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {

        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1,"Java");
        languageHashMap.put(2,"Python");
        languageHashMap.put(3,"C");
        //languageHashMap.put(4,"Java");
        System.out.println("HashMap : "+languageHashMap);



        /*Belirli bir key'e denk gelen value'yu dönürür*/
        String value = languageHashMap.get(2);
        System.out.println("Value at key 2 : "+value);

        //Keyleri bir set olarak dönme
        System.out.println("Keys : "+languageHashMap.keySet());

        //Value ları set olarak dönme
        System.out.println("Values : "+languageHashMap.values());

        //Key/Value pair çiftni bir set olarak dönmek
        System.out.println("Key/Value mappins : "+languageHashMap.entrySet());

        //Key varsa Value'sunu yoksa defaultta "Not Found" dön
        String value1 = languageHashMap.getOrDefault(1,"Not Found");
        System.out.println("Value for key 1 : "+value1);
        String value2 = languageHashMap.getOrDefault(5,"Not Found");
        System.out.println("Value for key 1 : "+value2);

        //Bir key var mı diye kontrol etmek
        if(languageHashMap.containsKey(2)){
            System.out.println("Map contains key value of : 2 ");
        }else {
            System.out.println("Key Not Found.");
        }

        //Bir value var mı diye kontrol etmek
        if(languageHashMap.containsValue("Java")){
            System.out.println("Map contains value of Java");
        }else{
            System.out.println("No such value.");
        }

        //Bir Key ile ilişkili Vale yu değiştirmek
        System.out.println("Orginal HashMap : "+languageHashMap);

        languageHashMap.replace(3,"Swift");
        System.out.println("HashMap after replace() : "+languageHashMap);


        //Bütün Value değerlerini upperCase' e çevirmek(ReplaceAll)
        languageHashMap.replaceAll((K, V) -> V.toUpperCase() );
        System.out.println("Updated HashMap : "+languageHashMap);


        //Bir HashMap den ögeleri kaldırmak/Silmek (Remove)
        String value3 = languageHashMap.remove(3);
        System.out.println("Removed value : "+value3);
        System.out.println("Updated HashMap : "+languageHashMap);

        //Bir hashMap den bir key/value çiftini kaldırmak silmek(remove(K,V))
        Boolean isDeleted =languageHashMap.remove(2,"Python");
        System.out.println("isDeleted : "+isDeleted);
        System.out.println("Updated HashMap : "+languageHashMap);





    }

}
