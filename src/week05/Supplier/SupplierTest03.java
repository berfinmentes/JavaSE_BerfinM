package week05.Supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest03 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalDate date2 = LocalDate.ofEpochDay(0);
//        System.out.println(date2);
//
//        long millis = 1713255057735L;
//        long second = millis/1000L;
//        long minute = second / 60;
//        long hour = minute / 60;
//        long day = hour/ 24;
//        LocalDate date3 = LocalDate.ofEpochDay(day);
//        System.out.println(date3);

        Supplier<String> currentTime = () -> LocalDateTime.now().toString();
        System.out.println(currentTime.get());
        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);




    }

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}
