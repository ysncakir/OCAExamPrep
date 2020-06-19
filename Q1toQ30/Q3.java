package Q1toQ30;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {

        int num[] [] = new int [1][3]; // row : 1, column: 3
        System.out.println(num.length);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num [i].length ; j++) {
                num[i][j] =10;
            }
        }

    }


    //[{10, 10, 10}]   [1][3]

    // num [0] [0] =10
    // num [0] [1] =10
    // num [0] [2] =10
}
