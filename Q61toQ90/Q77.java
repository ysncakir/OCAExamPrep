package Q61toQ90;

public class Q77 {

    void readCard(int cardNo) throws Exception{
        System.out.println("Reading card");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking card");
    }



    public static void main(String[] args) throws Exception {

        Q77 ex = new Q77();
        int cardNo = 12344;

        ex.readCard(cardNo);
        ex.checkCard(cardNo);

    }

    // asagida cagirdimiz method da exception throw yaptigi icin asagida da handle etmek lazim
}
