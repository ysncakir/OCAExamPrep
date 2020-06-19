package Q151toQ181;

public class Q160 {

    public static void main(String[] args) {

        Q160 ts = new Q160();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

     static boolean isAvailable = true;

}

// ilk olarak static true yazilacagi icin true : false