package Q91to120;

public class Q103 {

    public static void main(String[] args) {

        Student [] students = new Student[3] ;
        students [1] = new Student("Richard");
        students [2] = new Student("Donald");


        for (Student s: students) {
            System.out.println("" + s.name);
        }

    }

}

class Student {

    String name ;
    public Student (String name) {
        this.name = name;
    }
}

// Array de sira atlamak mumkun degil students[0] null olacagi icin, ilk iterate de nullpointer exception verir


