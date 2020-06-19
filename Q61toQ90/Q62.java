package Q61toQ90;

public class Q62 {

    public static void main(String[] args) {

        try {
            int num = 10;
            int div = 0;
            int ans = num / div;
        } catch (ArithmeticException ae){
        //     ans = 0;   ans yukarida try blok icinde tanimlandigi icin burada kullanilamaz
        } catch (Exception e){
            System.out.println("Invalid calculation");
        }

        // System.out.println("Answer = " + ans);  ans yukarida try blok tanimlandigi icin burada kullanilamaz
    }
}
