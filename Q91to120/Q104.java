package Q91to120;

import java.util.ArrayList;

public class Q104 {


    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        String [] myArray;

        try {
            while (true) {
                myList.add("My String");   // while loop infinite donuyor false olmuyor hic
                //System.out.println("Error");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught a Runtime Exception");
        } catch (Exception re) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}

// while loop infinite dondugu icin memory den kaynakli bir hata olusuyor
// Bu bir exception degil. O yuzden try catch ile cozemeyiz. Main icerisinde bu hata yer alir