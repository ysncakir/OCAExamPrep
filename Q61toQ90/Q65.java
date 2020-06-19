package Q61toQ90;

public class Q65 {

    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
       // return x + creditCard.substring(15,19);
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(maskCC("1234-5678-9101-1121"));

        StringBuilder sb = new StringBuilder("1234-5678-9101-1121");
        System.out.println( sb.substring(15,19));
    }

}

// son 4 haneyi gizlemek icin return x + creditcard(15,19) ve  append method kullanilabilir.
// sadece sb.substring(15,19) kullanmak yetmiyor bunu bir String e assign etmek lazim.
