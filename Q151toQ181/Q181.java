package Q151toQ181;

public class Q181 {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B "); // A B
        String tb = "C ";
        ta = ta.concat(tb); // A B C
        ta.replace('C', 'D'); // assign edilmemis, etkisi yok
        ta = ta.concat(tb); // A B C C

        System.out.println(ta);
    }
}
