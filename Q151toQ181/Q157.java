package Q151toQ181;

public class Q157 {

}

abstract class A3 {    // class yaziminda herhangi bir sorun yok
    private static int i;
    public void doStuff () {}
    public A3 (){}  // abstract class da constructor olabilir
}

final class A1 {        // class yaziminda herhangi bir sorun yok
    public A1(){}
}

//private class A2 {   // inner class private olabilir
//
//
//}

class A4 {                   // class yaziminda herhangi bir sorun yok
    protected static final int i = 10; // final ise mutlaka assign edilecek
    private A4 (){}
}

//final abstract class A5 {  // abstract class final olamaz. Override yapiliyor cunku
//    protected static int i;
//     void doStuff() {}
//     abstract void doIt ();
//}