package Q121toQ150;

import java.time.LocalDate;

public class Q122 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);
        System.out.println(date);
        date.plusDays(10); // assign etmemis, degisen bir sey yok
        System.out.println(date);
    }
}


// LocalDate class da immutable