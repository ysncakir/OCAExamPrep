package Q121toQ150;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q138 {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.of(2014, 7, 31, 1,1);

        date.plusDays(30);  // date e assign yapmadigi icin etkisi yok
        date.plusMonths(1); // date e assign yapmadigi icin etkisi yok

        System.out.println(date.format(DateTimeFormatter.ISO_DATE_TIME));

        // ilk tanimlandigi sekli yazidirir
        // 2014-07-31T01:01:00
    }
}
