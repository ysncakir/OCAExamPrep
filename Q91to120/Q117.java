package Q91to120;

import java.util.ArrayList;

public class Q117 {

    public static void main(String[] args) {

        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList.add(new Cat());

        ArrayList<Hunter> myList3 = new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Tiger> myList4 = new ArrayList<>();
        myList.add(new Cat());

        ArrayList<Animal> myList5 = new ArrayList<>();
        myList.add(new Cat());
    }

// Poly de subclass dan obj creat edip, referans olarak Super class verilir.
// myList4 de Q91to120.Cat class super class oldugu icin Q91to120.Tiger ona referans olamaz
}

abstract class Animal {

}

interface Hunter {

}

class Cat extends Animal implements Hunter {

}

class Tiger extends Cat {

}


