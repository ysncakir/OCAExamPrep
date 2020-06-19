package Q61toQ90.Q69;

public class Test {

    public static void main(String[] args) {
        //Employee employee1 = new Employee();
        Employee employee2 = new Employee("Jack", 50);
        Employee employee3 = new Employee("Chloe", 40, 5000);

        employee2.printDetails();
        employee3.printDetails();
    }

    // Employee class da regular constructor olmadigi icin employee1 hata verir.
}
