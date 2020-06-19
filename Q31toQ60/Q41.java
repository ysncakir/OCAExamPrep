package Q31toQ60;

import java.util.ArrayList;
import java.util.List;

public class Q41 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        System.out.println(names);

        if(names.remove("Bran")){
            names.remove("Jon");
        }

        System.out.println(names);


    }

    // it will remove first Bran

}
