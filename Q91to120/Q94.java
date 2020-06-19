package Q91to120;

public class Q94 {

    String myStr = "7007";

    public void doStuff (String str) {
        int myNum = 0;

        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne){
            System.err.println("Error");
        }

        System.out.println(
                "myStr: " + myStr + ", myNum: "+ myNum);
    }

    public static void main(String[] args) {
        Q94 obj = new Q94();
        obj.doStuff("9009");
    }

    // 7007 i hic degistirmedigi icin sabit kaliyor, myNum 9009 olarak yazilir.
    // eger this.myStr kullansaydi sorunun cevabi 9009, 9009 olurdu.
}
