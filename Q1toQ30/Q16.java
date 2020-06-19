package Q1toQ30;

public class Q16 {

    // break, continue ve sout un yerine gore print stat degisecek

    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
               System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }
}
