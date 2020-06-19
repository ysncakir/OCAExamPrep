package Q31toQ60;

public class Q47 {

    public static void main(String[] args) {

        String [] strs = {"A", "B"};
        int idx = 0;

        for (String s: strs) {
                strs[idx].concat(" element " + idx);
                idx++;
        }

        for ( idx = 0; idx < strs.length ; idx++) {
            System.out.print(strs[idx]);
        }

        // ilk for loop ta assign olmadigi icin hicbir ise yaramiyor

    }
}
