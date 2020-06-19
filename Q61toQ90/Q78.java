package Q61toQ90;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q78 {


    public static void main(String[] args) {

        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);
    }


    // parse methodun icinde saat yok. O yuzden format calismiyor
    //formatin icindeki iso date ile parse metodun ici ayni olmali
}
