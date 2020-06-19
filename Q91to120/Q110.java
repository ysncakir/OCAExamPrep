package Q91to120;

public class Q110 {

    public static void main(String[] args) {
        System.out.println("String main "+ args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("Object main "+ args[0]);
    }

    public static void main(int[] args) {
        System.out.println("int main "+ args[0]);
    }

    /*
    commands
    javac Q91to120.Q110.java
    java Q91to120.Q110 1 2 3
     */

    // command line da girilen degerler String olarak kabul edildigi icin ve ayrica main method sadece String ile run ettigi icin
    // bu soruda da args[0] =1 ve String olani yazdirir
}
