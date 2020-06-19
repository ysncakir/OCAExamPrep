package Q151toQ181;

public class Q165 {
    public static void main(String[] args) {

        int x = 100;
        int a = x++; //100
        int b = ++x; //102
        int c = x++; //102
        int d = (a < b) ? (a < c) ? a : (b<c) ? b :c : x ; // sondaki x 103 olur
        System.out.println(d);
    }

}


// a ==100;
// sondaki x 103 olur
// ternary de ? ve : sayisi ayni olmali