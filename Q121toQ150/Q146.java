package Q121toQ150;

import java.time.LocalDate;

public class Q146 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10); // assign edilmemis, etkisi yok
        System.out.println(date); // 2012-01-30
    }
}
