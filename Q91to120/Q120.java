package Q91to120;

public class Q120 {

    static double area;
    int b =2, h =3 ;

    public static void main(String[] args) {
        double p, b, h ;

        if (area ==0) {
            b =3;
            h =4;
            p =0.5;
            area = p * h * b ;
        }
        System.out.println("Area is " + area);
    }
}

// yukaridaki static area baslangicta 0 oldugu icin area 6 olur.
// baslangictaki b =2 ve h =3 un bir kiymeti yok