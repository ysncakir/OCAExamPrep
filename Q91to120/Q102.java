package Q91to120;

public class Q102 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        System.out.println(sb); // Java yazdirir

        if (sb.toString().equals(s.toString())){  // s.toString hicbir sey degistirmez. Ikisi esit olur
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No match");
        }
    }
}


// sadece sb olursa heap memoryde String stack de oldugu icin (ayni yerde olmadigi) icin esit degil
// sb.toString() yaparsak String ile ayni memory ye getiriyor