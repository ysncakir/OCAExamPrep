package Q31toQ60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {

    public static void main(String[] args) {
        String [] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        if(arrList.removeIf(s -> {
            System.out.print(s);
            return s.length() <=2; })){
            System.out.println(" removed");
        } else{
            System.out.println(" Noldu kamil");
        }
    }

    // s ==> arraylistin tamamina karsilik geliyor
    // once  s i yazdiriyor
    // sonra hi 2 harfli oldugu icin removed yaptiriyor
}
