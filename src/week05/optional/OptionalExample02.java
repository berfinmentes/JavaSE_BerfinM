package week05.optional;

import java.util.Optional;


public class OptionalExample02 {
    public static void main(String[] args) {

        Optional<String> nullStr = Optional.ofNullable(null);
//        String str = null;
//        System.out.println(str.toUpperCase());
        System.out.println(nullStr);
        nullStr = Optional.of("test1");
        nullStr.ifPresent(e-> System.out.println(e.toUpperCase()));

        nullStr = Optional.empty();
        nullStr.ifPresent(e-> System.out.println(e.toLowerCase()));


        System.out.println(findNameById(2L));
        findNameById(1L).ifPresentOrElse(s-> System.out.println("Merhaba" + s ),()-> System.out.println("safaasfa"));

        if(findNameById2(2L) != null){
            System.out.println("Merhaba "+ findNameById(2L));
        }else{
            System.out.println("üzgünüm bulunamadı.");
        }

        Optional<String> nullStr2 = Optional.ofNullable(null);

        System.out.println(nullStr2.map(String::length).orElse(-1));
        System.out.println(nullStr2.map(String::length).orElseThrow(NullPointerException::new));
    }



    public static Optional<String> findNameById(Long id){
        String name = null;
        if(id == 1){
            name = "Test2";
        }
        return Optional.ofNullable(name);

    }

    public static String findNameById2(Long id){
        String name = null;
        if(id == 1){
            name = "Test 3";
        }
        return name;
    }
}



