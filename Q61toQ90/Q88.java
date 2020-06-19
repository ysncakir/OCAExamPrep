package Q61toQ90;

public class Q88 {

    public static void main(String[] args) {

        int wd = 0;

        String days [] = {"sun", "mon", "wed", "sat"};

        for (String s : days){
            switch (s) {
                case "sat" :
               //     break;
                case "sun" :
                    wd -= 1;
                    break;
                case "mon":
                    wd -= 1;
                    break;
                case "wed" :
                    wd +=2 ;
            }
        }
        System.out.println(wd);
    }
}

// 1. sun ==> -1
// 2. mon ==> -2
// 3. wed ==> 0 (+2 geldi)
// 4. sat ==> -1

// break statement sadece switch den cikar for each loop devam eder. Break yoksa alttakini de yazdirir
// sat dan sonra break olsaydi en son 0 da kaldigi icin 0 yazardi