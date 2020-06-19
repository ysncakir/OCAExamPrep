package Q91to120;

public class Q108 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();

        director.salary = 80000;
        employee.salary = 50000;
        // director.stockOptions;  ulasamayiz
        // manager.budget; ulasamayiz

        // Referans type hangi method ve variable kullanilacagina karar verir

    }

}

class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}
