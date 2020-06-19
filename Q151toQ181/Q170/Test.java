package Q151toQ181.Q170;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);
    }
}


class MyString {
    String msg;
    MyString (String msg) {
        this.msg = msg;
    }
}

// new MyString yazarak obj e olusuyor. Sonrasinda instance var.
// cagirmak mumkun.