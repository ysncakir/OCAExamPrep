package Q151toQ181;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q167 {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1,1);
        dt.plusDays(30); // assign edilmedigi icin etkisi olmaz
        dt.plusMonths(1); // assign edilmedigi icin etkisi olmaz
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}

// LocalDateTime class oldugu  icin Exception vermiyor
