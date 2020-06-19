package Q151toQ181;



public class Q154 {

    int count;


    public static void displayMsg() {
        //System.out.println("Welcome visit count : " + count++); // count local oldugu icin global olani kullamaz
    }

    public static void main(String[] args) {

        Q154.displayMsg();  // hata yok
        displayMsg(); // hata yok


    }


}
