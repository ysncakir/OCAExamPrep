package Q61toQ90;

public class Q79 {

    public static void main(String[] args) {

        String [] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i].equals("D")){
                System.out.println("Work Done");
                break;
            }
            continue;
        }
    }
}
 // ABCD Work done yazilir