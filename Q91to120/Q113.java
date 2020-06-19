package Q91to120;

public class Q113 {

    public static void main(String[] args) {

        int wd =0;
        String [] days = {"sun", "mon", "wed", "sat"};

        for (String s:days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);

    }
}
// sonuc 3 olur
// sun : -1, mon : 2, wed : 4, sat : 3