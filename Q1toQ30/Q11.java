package Q1toQ30;

public class Q11 {

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x+y));
    }

//    public static void doSum(int x, int y){
//        System.out.println("int sum is " + (x+y));
//    }

    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x+y));
    }

    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x+y));
    }

    public static void main(String[] args) {
//        Integer a =10;
//        Integer b =20;
//        doSum(a,b);
        doSum(10,20);
        doSum(10.0, 20.0);
    }
}

// ilk olarak primitive, sonra Wrapper