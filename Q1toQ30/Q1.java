package Q1toQ30;

public class Q1 {


    public static void main(String[] args) {

        Boolean [] boo1  = new Boolean [2];
        boo1[0] = new Boolean(Boolean.parseBoolean("true"));
        boo1 [1] = new Boolean(null);

        System.out.println(boo1[0] + " " + boo1[1]);

        // boolean default ve null value false
        // parse method accepts String "true" , geri kalani false




    }

    public final static void method(){
        System.out.println("Valid method");
    }



}
