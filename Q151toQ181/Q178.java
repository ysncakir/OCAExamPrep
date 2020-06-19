package Q151toQ181;

public class Q178 {

    public static void main(String[] args) {

        int ans;

        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;

        } catch (Exception e) {
            System.out.println("Invalid calculation");

        }

       //System.out.println("Answer = " + ans);  // line 2

        // ans instance oldugu icin object ile kullanmasi gerekir.
        // ans try catch icinde assign etmenin bir hukmu yok.
        // ikinci catch de handle etmedigi icin sorun oluyor


    }
}
