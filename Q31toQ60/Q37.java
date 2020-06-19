package Q31toQ60;

import java.util.Arrays;

public class Q37 {

    public static void main(String[] args) {

        int [] intArr = {15, 30, 45, 60, 75};
        intArr [2] = intArr [4];
        intArr [4] =90;

        String arr = Arrays.toString(intArr).replace("[", "")
                .replace("]", "")
                .replace(", ", " ");

        System.out.println(arr);

    }
}
