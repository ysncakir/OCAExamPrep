package Q121toQ150;

public class Q120 {

    public static void main(String[] args) {

        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = obj1;

        t.displayI();  //C1 yazdirir
        s.displayC2(); // C2 yazdirir


    }
}

interface I {
    public void displayI ();
}

abstract class C2 implements I {

    public void displayC2 () {
        System.out.println("C2");
    }
}

class C1 extends C2 {


    @Override
    public void displayI() {
        System.out.println("C1");
    }
}
