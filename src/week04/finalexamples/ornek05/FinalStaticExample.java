package week04.finalexamples.ornek05;

import week04.finalexamples.ornek04.Main;

public class FinalStaticExample {
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String DOT = ".";

    public static void main(String[] args) {
        String uuid = "123456";
        String request = "123456";
        System.out.println(uuid.concat(COLON).concat(request));


        System.out.println("String builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(uuid).append(COLON).append(request));

        String programmingLang = "Java,.NET,Pyhton";
        String[] programmingArr = programmingLang.split(COMMA);
        for(String lang : programmingArr){
            System.out.println(lang);
        }


    }


}
