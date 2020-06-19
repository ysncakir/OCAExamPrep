package Q151toQ181;

public class Q171 {

    public static void main(String[] args) {

        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")){
            res = "White";
        } else {
            res = "No result";
        }

        System.out.println(res);


        res = (stuff.equals("TV")) ? "Walter" : stuff.equals("Movie") ? "White" : "No result";

        System.out.println(res);
    }
}


// if statement ternary olarak nasil yazilir ?
// mutlaka assign etmeli

