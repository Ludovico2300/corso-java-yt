package Pacchetto1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // data e ora

        LocalDate x = LocalDate.now();
        System.out.println(x);
        System.out.println(x.getDayOfMonth());
        System.out.println(x.getMonth());
        System.out.println(x.getYear());
        LocalTime y = LocalTime.now();
        System.out.println(y);
        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);

        // formattare

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = x.format(format);
        System.out.println(data);

    }

}
