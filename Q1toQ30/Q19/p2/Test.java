package Q1toQ30.Q19.p2;

import Q1toQ30.Q19.p1.Acc;

public class Test extends Acc {

    public static void main(String[] args) {
        Acc obj = new Test();

        obj.s= 8;
    }

    // sadece public olana ulasilabiliyor
    // eger protected e ulasmak istiyorsak obj referans type sub class olmali
}
