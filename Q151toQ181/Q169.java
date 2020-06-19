package Q151toQ181;

public class Q169 {

    public static void main(String[] args) {

        int x = 1;
        int y = 0;

        if (x++ > ++y) { // 1 > 1 ==> false oldugu icin Welcome yazilir
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }

        System.out.println("Log " + x + " : "+ y);  //x=> 2  y =>1 olur
    }
}
