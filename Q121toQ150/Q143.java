package Q121toQ150;

public class Q143 {

    public static void main(String[] args) {

        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);

        System.out.println(a + " "+ b);


    }

}

/*
Given commands:
java Q143.java
java Q143 1 null

 */

// args[0]=1 ve args[1]=null oldugu yani dolu oldugu icin a ve b false verir
// valueOf String ve boolean deger aliyor. String true argument disinda false veriyor