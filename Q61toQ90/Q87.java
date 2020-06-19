package Q61toQ90;

public class Q87 {

    public static void main(String[] args) {

        int [][] n = {{1,3}, {2,4}};   // n => 2 n[0] =>2 , n[1] =>2

        for (int i = n.length-1; i >= 0 ; i--) { // 2 defa loop yapacak, 1 ve 0
            for (int j = n[i].length-1; j >=0; j--) { // 2 defa loop yapacak 1 ve  0
                System.out.print(n[i][j]);
            }
        }
    }
}

// loop lar tersten calisiyor. Hem n in length i hem de n[0] ve n[1] lengthi de 2
