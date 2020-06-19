package Q151toQ181;

public class Q152 {

    public static void main(String[] args) {

        int [][] n = {{1,3}, {2,4}};  //[2][2]; ikiser defa loop yapar


        for (int i = n.length-1; i >=0 ; i--) { // loop 1 den baslar ve sonra 0 alir
            for (int y : n[i]) {  // n[i] ilk olarak n[1] olur yani 2,4
                System.out.print(y);
            }
        }
    }
}

// for each tersten yazdiramaz. 2,4,1,3