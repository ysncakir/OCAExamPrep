package Q1toQ30;

public class Q30 {

    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        if(x++ < ++y){
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println( "Log " + x + ":" + y);
    }
}
