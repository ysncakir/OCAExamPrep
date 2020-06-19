package Q31toQ60;

public class Q54 {

    public static void main(String[] args) {

        String [][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");   // A B C D E
                if (arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }
}

// B den sonra break oldugu icin ilk array tamamlanir C yazilmaz
