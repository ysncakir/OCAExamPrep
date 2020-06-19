package Q121toQ150;

import java.time.LocalDate;

public class Q131 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date); // day 32 olamaz

        // throws Datetime Exception

        // Ayrica LocalDate immutable oldugu icin zaten ilave edemezdik
    }
}
