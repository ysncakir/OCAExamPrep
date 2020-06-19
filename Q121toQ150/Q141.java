package Q121toQ150;

public class Q141 {

    public static void main(String[] args) {

        Employee e = new Employee ();
//        e.name = "Joe";
//        e.contract = true;
//        e.salary =100;


        System.out.println(e);
    }
}

class Employee {
    String name;
    boolean contract;
    double salary;

    Employee () {
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);

    }

    public String toString() {
        return name + " : " + contract + " : "+ salary;
    }


}

// Q: print Joe : true : 100.0
// Bunu yazdirmak icin 1. obje ile variable assign ederiz; e.name; e.salary; e.contract
// 2. constructora parametre ekleyip varible lari assign ederiz.
//3. setter methodu kullanabiliriz
//4. wrapper class lardan obje olusturup da yazdirabiliriz