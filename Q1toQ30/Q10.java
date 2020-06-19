package Q1toQ30;

public class Q10 {

    public int amount;

    public Q10(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void changeAmount(int x){
        amount += x;
    }

    public static void main(String[] args) {

        Q10 acct = new Q10((int) (Math.random()*1000));
        //acct.changeAmount(-acct.amount);
        System.out.println(acct.amount);
    }

    // account balance 0 yapmaya calisiyoruz.
    // setAmount(0)
    // amount initialize 0
    // changeAmount method icinde
}
