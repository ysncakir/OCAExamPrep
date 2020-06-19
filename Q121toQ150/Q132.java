package Q121toQ150;

public class Q132 {

    int i;
    static int j; //6
    public static void main(String[] args) {

        Q132 x1 = new Q132 ();
        Q132 x2 = new Q132 ();

        x1.i = 3 ;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;

        System.out.println(
                x1.i + " " +   // 3
                x1.j + " " +   // 6
                x2.i + " " +   // 5
                x2.j );        // 6



    }

    // static variable son assign edilen deger sabit kalir tum objeler paylasir
}
