package Q61toQ90;

public class Q89 {

    public static void main(String[] args) {

        int x = 6;
        while (isAvailable(x)) {
            System.out.print(--x);  // bu line ilave olursa 54321 yazilir

        }
    }


    public static boolean isAvailable (int x) {

        return --x > 0 ? true : false ;
    }

    // metod icindeki x in azalmasi yukariyi ilgilendirmiyor
}


