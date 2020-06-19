package Q121toQ150;

public class Q123 {

    int a1;

    public static void doProduct (int a) {
        a = a * a;
    }

    public static void doProduct (String s) {
        s.concat(" " + s);
    }


    public static void main(String[] args) {

        Q123 item = new Q123();
        item.a1 =11;

        String sb = "Hello";
        Integer i = 10;
        doProduct(i);
        doProduct(item.a1);

        System.out.println(i + " " + sb + " " + item.a1);
    }


}

// print statement direk variable lari yazdiriyor. Metodlar ile hicbir isimiz yok
