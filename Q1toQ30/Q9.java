package Q1toQ30;

public class Q9 extends B {

    public Q9(){
        System.out.print("A ");
    }

    public static void main(String[] args) {

        Q9 a = new Q9();
    }
}

class C {

    public C(){
        System.out.print("Q1toQ30.C ");
    }
}

class B extends C{

    public B() {
        System.out.print( "Q1toQ30.B ");
    }
}
