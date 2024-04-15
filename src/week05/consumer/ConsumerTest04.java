package week05.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest04 {
    /*
    Bir Product sınıfı oluşturalım isim ve fiyatı olsun.
    AllArgsConstructor' ı olsun
    Encapsulation kurallarına uygun bir şekilde hazırlayalım
     */

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop",  4000.0));
        productList.add(new Product("Phone",  80000.0));
        productList.add(new Product("Tablet",  500000D));

        //Consumer kullanarak her bir ürünün adını ve fiyatını yazdır

        Consumer<Product>  product1 = (Product x) -> {
            System.out.println(x.getName()+x.getPrice());
        };

        productList.forEach(product1);


    }
}

