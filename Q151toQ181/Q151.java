package Q151toQ181;

public class Q151 {



}

class Customer {

    ElectricAccount acct = new ElectricAccount();

    public void useElectricity (double kwH) {
        acct.addKWH (kwH);
    }



}

class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    // write a method; bill is always equal to kWh * rate:

    public void addKWH (double kWh) {
        if (kWh > 0) {      // eksi deger girilip yanlis bir sonuc cikmasin diye
            this.kWh += kWh;
            this.bill = this.kWh * rate;

        }
    }


}