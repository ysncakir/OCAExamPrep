package Q61toQ90;

public class Q82 {

    public static void main(String[] args) {

        String [][] chs = new String[2][];

        chs [0] = new String[2];
        chs [1] = new String[5];

        int i = 97;

        for (int j = 0; j < chs.length; j++) {  // 2 defa loop yapacak 0 ve 1
            for (int k = 0; k < chs.length ; k++) { // 2 defa loop yapacak
                 chs[j][k] = "" + i;
                 i++;
            }
        }

        // ilk for loop sonunda :
        // chs [0] = {97,98}
        // chs [1] = {99, 100, null, null, null}  // uzunlugu 5 cunku

        for (String [] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }



    }


}
