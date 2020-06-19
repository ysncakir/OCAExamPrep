package Q91to120;

public class Q106 {

    public static void main(String[] args) {
        Q106 ts = new Q106 ();
        System.out.println(isAvailable + " ");  // false => direk static variable cagriliyor

        isAvailable = ts.doStuff(); // true
        System.out.println(isAvailable);
    }

    public static boolean doStuff () {
        return !isAvailable; // true
    }

    static boolean isAvailable =false;
}
