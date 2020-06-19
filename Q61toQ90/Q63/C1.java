package Q61toQ90.Q63;

public class C1 extends C2 implements I {
    @Override
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {

        C2 obj1 = new C1();
        I obj2 = new C1();

//        C2 s = obj2; // C2 sub oldugu icin cast yapmadan kullanilmaz
//        I t  = obj1; // C2 ile I arasinda iliski yok

        obj1.displayC2();
        obj2.displayI();

    }
}
