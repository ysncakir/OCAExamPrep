package Q31toQ60;

public class Q60 {

    public static void main(String[] args) {
        C cc = new C();
    }

    static class A {
        public A (){
            System.out.println("A");
        }
    }

    static class B extends A{
        public B (){
            System.out.println("B");
        }
    }

    static class C extends B {
        public C (){
            System.out.println("C");
        }
    }
}
