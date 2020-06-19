package Q61toQ90;

public class Q72 {

    Character c;
    Integer ir;
    char ch;
    boolean b;
    float f;
    int i ;
    double d;
    void printAll(){
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("f= " + f);
        System.out.println("i= " + i);
        System.out.println("d= " + d);
        System.out.println("ch= " + ch);
        System.out.println("ir= "+ ir);
    }

    public static void main(String[] args) {

        Q72 f = new Q72();
        f.printAll();

    }

    // null degerler onemli
    // Character ve string = null
    // boolean = false
    // number alanlar = 0
    // !!!! char in default degeri empty. Herhangi bir sey vermiyor
}
