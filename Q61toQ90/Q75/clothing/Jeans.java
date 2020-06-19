package Q61toQ90.Q75.clothing;

public class Jeans {

    public void mathcShirt (){
        String color =Shirt.getColor();   // line 2
        if(color.equals("Green")) {
            System.out.println("Fit");
        }
    }


    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.mathcShirt();
    }
}


// sonuc olarak Fit yazdirmak icin line 1 da static import yapip, line 2 da getColor methodu gerekir.
// static import yapmadan class i import yapip, Shirt.getColor();