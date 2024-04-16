package week05.Supplier;

import java.sql.SQLOutput;
import java.util.Optional;

public class SupplierTest05 {
    private static String staticname = "static name";

    public static void main(String[] args) {
        Optional<String> name = findNameById(1L);
        if(name.isEmpty()){
            System.out.println("Girdiğiniz id' li kullanıcı bulunamadı.");
            System.exit(1);
        }
        System.out.println(name);

        String name2 = findNameById(2L).orElseGet(() -> staticname);
        System.out.println(name2);
    }

    private static Optional<String> findNameById(Long id){
        String name = null;
        if(id == 1L){
            name = "Java";
        }

        return Optional.ofNullable(name);
    }
}
