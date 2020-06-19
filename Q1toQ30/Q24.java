package Q1toQ30;

public class Q24 {

    public static void main(String[] args) {

        String [] strs = new String[2];  // null, null
        strs[0] = "";
        strs[1] = "";
        System.out.println(strs.length);
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }

        // basta element i tanimlamazsak null pointer exception veriyor
        // bos array e concat yapamiyoruz
        // ilk loop da assign edilmiyor hicbir etkisi olmaz


    }
}
