package Q151toQ181;

import java.util.ArrayList;

public class Q155 {

    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);  // index veya object kaldirir
        points.remove(null);

        System.out.println(points);
    }

}

// remove(index number) or remove(object)==> wrapper ile kullanabiliriz
// 1, 3, 4
