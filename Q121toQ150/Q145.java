package Q121toQ150;

import java.util.ArrayList;
import java.util.List;

public class Q145 {

    public static void main(String[] args) {

        List ps = new ArrayList<>();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        // line 14

        int f = ps.indexOf(p2); // p2 nin indexi 0 oldugu icin true olur ve yazdirir

        if (f >= 0) {
            System.out.println("Mike found");
        }

    }
}

class Patient {

    String name;
    public Patient (String name) {
        this.name = name;
    }
}


// Q: line 14 e girilen code Mike found yazdirsin
// new Patient Mike array de herhangi bir element olarak atanmadigi icin diger sik olmaz