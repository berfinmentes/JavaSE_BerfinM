package week05.Supplier;

import java.util.function.Supplier;

public class SupplierTest01 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Supplier Example";
        System.out.println(supplier.get());
    }
}
