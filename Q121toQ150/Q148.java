package Q121toQ150;

public class Q148 {

    // there is a grid showing a 2d array
    /*

    0       0               char [0]
            x       0       char [1]
    x               x       char [2]

    x x x yapmak icin hangisi eklenmeli
     */

    public static void main(String[] args) {

        char [][] grid = new char[3][3];
        grid [1][1] = 'X';
        grid [0][0] = '0';
        grid [2][1] = 'X';
        grid [0][1] = '0';
        grid [2][2] = 'X';
        grid [1][2] = '0';

        grid [2][1] = 'X';



    }
}

// char[2] row una ikinci eleman olarak X eklersek sira tamamlanir