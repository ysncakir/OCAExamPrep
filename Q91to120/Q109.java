package Q91to120;

public class Q109 {

    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;  // a
        var2 = 'e'; //e

        Q109 obj1 = new Q109();
        Q109 obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';  // obj2 ve obj1 ayni oldugu icin i yaptiktan sonra ikisi de ayni degeri alir

        System.out.print(var1 + " " + var2);  // a e
        System.out.print(obj1.var + " " + obj2.var); // i    i

    }
}


// obj1 ve obj2 ayni oldugu icin var once o sonra i yapiliyor