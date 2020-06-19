package Q31toQ60;

public class Q33 {

    public static void main(String[] args) {
        int x =5 ;

        while (isAvailable(x)){
            System.out.print(x);
            x--;  // bunu ilave etmeden sonsuz yazdirir
        }
    }

    public static boolean isAvailable(int x){

        return x-- > 0 ? true : false ;
    }
}
