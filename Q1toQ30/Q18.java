package Q1toQ30;

public class Q18 {

    public static void main(String[] args) {

        String [][] chs= new String [5][2];
        chs [0] = new String[2];
        chs [1] = new String[5];

        int i = 97;

        for (int a = 0; a < chs.length ; a++) { // length  = 5
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i ++;
            }
        }

        for (String [] ca : chs) {
            for (String c : ca){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}

// chs nin uzunlugu 5, fakat chs[0] ninki 2. 2 lik arraye 5 element assign ediliyor