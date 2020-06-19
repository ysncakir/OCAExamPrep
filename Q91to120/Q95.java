package Q91to120;

public class Q95 {

}

class Base {
    public void  test () {
        System.out.println("Q91to120.Base");
    }
}

class DerivedA extends Base {
    public void  test () {
        System.out.println("Q91to120.DerivedA");
    }
}

class DerivedB extends DerivedA {
    public void  test () {
        System.out.println("Q91to120.DerivedB");
    }

    public static void main(String[] args) {

        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3; // ikisi de base referansli oldugu icin hicbir etkisi yok
        Base b4 = (DerivedA) b3 ; // ikisi de base referansli oldugu icin hicbir etkisi yok

        b1.test();   //  Derived B yazar
        b4.test();   // Derived B yazar

    }
}
