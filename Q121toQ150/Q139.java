package Q121toQ150;

public class Q139 {

    public void updatePrice (Product product, double price) {
        price = price * 2 ;
        product.price = product.price + price ;
    }

    public static void main(String[] args) {

        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Q139 t =new Q139 ();
        t.updatePrice(prt, newPrice);  // 400, 200
        System.out.println(prt.price + " : " + newPrice);


    }

}

class Product {
    double price; // ilk once 200 olur. Method dan sonra 400 olur
}

// updatePrice (200, 100) : price = 200, product.price = 200+200 =  400
// newPrice in degismesi icin object ile yazilmasi lazim