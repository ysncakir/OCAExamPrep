package Q91to120;

public class Q105 {

    int x, y ;

    public Q105 (int x, int y){
        initialize (x,y);
    }

    public void initialize (int x, int y) {
        this.x = x  * x;
        this.y = y * y ;
    }

    public static void main(String[] args) {

        int x =9 , y = 5 ;

        Q105 obj = new Q105 (x,y);
        System.out.println(x + " " + y);
        System.out.println(obj.x + " " + obj.y);
    }
}

// Print ederken instance variable i cagirmiyor yani obje ile cagirmiyor.
// Sadece main metod icindenkileri yazdirdigindan x= 9 ile y= 5 olarak kalir
