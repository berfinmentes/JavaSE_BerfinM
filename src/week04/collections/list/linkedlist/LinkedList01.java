package week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        Queue<String> languageQueue = new LinkedList<>();

        //Eleman ekleme

        languageQueue.add("Python");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("LinkedList : "+languageQueue);


        /*En baştaki elemana erişim*/
        String str1 = languageQueue.peek();
        System.out.println("Accessed Element : "+str1);

        /*En başaki elemana erişip listeden çıkarır*/
        String str2 = languageQueue.poll();
        System.out.println("Removed element : "+str2);
        System.out.println("LinkedList after poll() : "+languageQueue);

        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer() : "+languageQueue);



    }

}
