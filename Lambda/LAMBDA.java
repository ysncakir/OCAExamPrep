package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMBDA {

    public static void main(String[] args) {
        IntOperation sumUp;
        sumUp = (x,y) -> x+y;
        System.out.println(sumUp.sum(3,5));


        List<Integer> list= new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
        System.out.println(list);

        list.removeIf(x-> x%2 !=0);
        System.out.println(list);

        list.forEach(x-> System.out.println(x));



    }


}


interface  IntOperation{

    int sum(int a, int b);
   // int div();
}
