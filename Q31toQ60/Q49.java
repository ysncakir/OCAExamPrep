package Q31toQ60;

public class Q49 {

    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        int x = array.length;

        while (x>0) {
            x--;
            System.out.print(array[x] + " ");
        }
        System.out.println();

        while (x>0) {
            System.out.print(array[--x] + " ");
        }

//        do {
//            x--;
//            System.out.println(array[x]);
//        } while (x>= 0);        esittir dedigi icin 0 da -1 inci element icin loop devam ediyor




    }
}

