package Lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {

    public static void main(String[] args) {

        System.out.println( removeDup("YAAASSSSSIINN"));

       String kamil = UniqueChars("Kaaamilllll");
        System.out.println(kamil);

        System.out.println(frequency("CAAAAKKKKIIIIRR"));
    }

    public static String removeDup(String str){
        return Arrays.stream(str.split(""))
                .distinct().reduce("", (x,y) -> x+y);
    }

    public static String UniqueChars(String str){

        String[] split = str.split("");

        Map<String, Integer> map = new HashMap<>();

        System.out.println(map);

        for (String each: split) {
            if(!map.containsKey(each)){
                map.put(each, 1);
            } else{
                map.put(each, map.get(each)+1);
            }
        }

        System.out.println(map);

        return map.entrySet().stream()
                             .filter(x->x.getValue() ==1)
                             .map(x-> x.getKey())
                             .collect(Collectors.joining());
    }


    public static String frequency(String str){

        String[] split = str.split("");

        Map<String, Integer> map = new HashMap<>();

        for ( String each: split) {
            if(!map.containsKey(each)){
                map.put(each, 1);
            } else{
                map.put(each, map.get(each)+1);
            }
        }

        System.out.println(map.entrySet());

        return map.entrySet().stream()
                .map(x->x.getKey() + x.getValue())
                .collect(Collectors.joining());


    }
}
