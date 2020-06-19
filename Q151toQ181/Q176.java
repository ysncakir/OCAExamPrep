package Q151toQ181;

import java.time.LocalDate;

public class Q176 {

    public static void main(String[] args) {

        Student s1 = new Student ();
        Student s2 = new Student ();
        Student s3 = new Student ();

        s1 = s3; // s3 u s1 e assign edilince s1 in eski degeri bosa cikiyor
        s3 = s2;
        s2= null;

    }
}


class Student {
    String name;
    int age;
}

// kullanilmayan object cope gider
// 1 object bosa ciktigi icin garbage collectiona eligible olur.