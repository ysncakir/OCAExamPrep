package Q121toQ150;

public class Q125 {
}

class Base {
    public void  test () {
        System.out.println("Base");
    }
}

class DerivedA extends Base {
    public void  test () {
        System.out.println("DerivedA");
    }
}

class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {

        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3; // derived b

        b1 = (Base) b2; // ikisi de base referansli oldugu icin hicbir etkisi yok

        b1.test();   //  DerivedA assign edidigi icin Derived A yazar
        b4.test();   // DerivedB assign edidigi icin Derived B yazar

//        System.out.println();
//        StringBuilder s1 = new StringBuilder("Java");
//        String s2 = "Love";
//        s1.append(s2); // javalove
//        System.out.println(s1.substring(4));
//
//        int i = s1.indexOf(s2);
//
//        System.out.println(s1);
//        System.out.println(i);


    }

    static Exception print (int i) {
        if (i>0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}




