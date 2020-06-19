package Q151toQ181;

public class Q159 {

    public static void main(String[] args) {

        // Q151toQ181.Employee e1= new Q151toQ181.Employee(); // Q151toQ181.Employee classda tanimlanmamis, hata verir
        Employee e2= new Employee("Jack", 50);
        Employee e3= new Employee("Chloe", 40, 5000);

   //     e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }

}

class Employee {   // Q151toQ181.Employee class constr. call dan hata verir
    private String name;
    private int age;
    private int salary;

    public Employee (String name, int age) {
        setName (name);
        setAge(age);
        setSalary(2000);
    }

    public Employee (String name, int age, int salary) {
        setSalary(salary);
      //  this(name, age);  // Constr. call ilk satirda olmali

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printDetails() {

        System.out.println(name + " " + age + " " + salary);
    }
}