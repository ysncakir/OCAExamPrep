package Q1toQ30;

public class Q23 {

    public static void main(String[] args) {

        int [] stack = {10,20,30};
        int size = 3;
        int idx = 0;

        do {
            idx++ ;  // 1  2
        } while (idx < size -1);
                // 1 < 2
                // 2 < 2 false yapar ve loop tan cikar
        System.out.println("Top element: "+ stack[idx]); // stack[2] lazim
    }
}
