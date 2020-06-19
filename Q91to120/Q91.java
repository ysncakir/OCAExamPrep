package Q91to120;

public class Q91 {

    public static void main(String[] args) {

        Short s1 = 200;
        Integer s2 = 400;
       //  String s3 = (String) (s1 + s2);   this line will give compile error. We cannot cast short, integer to String
        Long s4 = (long) s1 + s2 ;

        System.out.println("Sum is " + s4);




    }
}
