package Q121toQ150;

public class Q140 {

    static int i; //3, 5
    int j;

    public static void main(String[] args) {

        Q140 x1 = new Q140();
        Q140 x2 = new Q140();

        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j =6;

        System.out.println( x1.i + " " + x1.j + " "+ x2.i+ " " +x2.j);
    }
}

// i static oldugundan son deger ne ise onu yazdirir.
// en son 5 oldugu icin 2 defa 5 yazdiracak