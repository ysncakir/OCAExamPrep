package Q151toQ181.Q175;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director= new Director();


        // line 1
        employee.salary =50000; // Employee class da salary var, cagirabilir
        director.salary =80000; // inherit edecek
    //    employee.budget = 200000; // Employee class da budget yok
        manager.budget = 1000000;
    //    manager.stockOptions; // Manager class da stockOptions yok
        director.stockOptions =1000;


    }
}


// Q: which two options fail when placed at line 1