package Q121toQ150;

public class Q121 {

    public static void main(String[] args) {

        String myStr = "Hello World ";
        myStr.trim(); // trim method bastaki ve sondaki bosluklari kaldirir
        int i = myStr.indexOf(" ");

        System.out.println(i);

        System.out.println(myStr + "-");

        // myStr.trim() assign edilmedigi icin hicbir etkisi yok
        // Dolayisiyla ilk buldugu bosluk 5. sirada oldugu icin 5 basar
    }
}
