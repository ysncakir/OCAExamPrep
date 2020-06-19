package Q151toQ181;

public class Q162 {

    int count;

    public  static void displayMsg() {
        //count++  static oldugu icin Direk kullanamyiz
         //System.out.println("Welcome visit count : " + count++); // count local oldugu icin global olani kullamaz

    }

    public static void main(String[] args) {

        Q162.displayMsg();  // hata yok
        displayMsg(); // hata yok
    }
}
