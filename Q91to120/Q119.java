package Q91to120;

public class Q119 {

    public static final int MIN =1;

    public static void main(String[] args) {

        int x = args.length;

        if(checkLimit(x)) {
            System.out.println("Java SE");
        } else {
            System.out.println("Java EE");
        }
    }


    public static boolean checkLimit (int x) {
        return x >= MIN ? true : false;
    }
}

// javac Q91to120.Q119.java
// java Test 1
// yukaridaki command lerden sonra args.length = 1 olacagi icin method true doner.

