package Q31toQ60;

public class Q36 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("java");

        if (str2.equalsIgnoreCase(str1))
        {
            System.out.println("Egual");
        } else {
            System.out.println("Not Equal");
        }
    }

    // str.toLowercase yaptiktan sonra tekrar assign etmek lazim
}
