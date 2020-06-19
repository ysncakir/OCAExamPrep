package Q121toQ150;

public class Q136 {
    public static void main(String[] args) {

        A b1 = new A ();
        A b2 = new C ();
        b1 = (A)b2;
        A b3 = (B)b2; // b2 object i C class dan ama B ile cast edince
                        // C ile B arasinda iliski olmadigi icin problem cikarir.

        A b4 = (B)b2;
        b1.Test();
        b3.Test();

    }

}

class A {
    public void Test () {
        System.out.println("A");
    }
}

class B extends A {
    public void Test () {
        System.out.println("B");
    }
}


class C extends A {
    public void Test () {
        System.out.println("C");
    }
}
