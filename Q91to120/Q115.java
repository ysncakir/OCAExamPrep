package Q91to120;

public class Q115 {

    public static void main(String[] args) {

        String str1 = "Java";

        String [] str2 = {"J", "a", "v", "a"};

        String str3 ="";

        for (String str : str2) {
            str3= str3 +str;
        }

        boolean b1 = (str1.equals(str3));  // true
        boolean b2 = (str1 ==str3); // false

        System.out.println(b1 + " " + b2);
    }
}

// iki farkli object == ile esitlenemez