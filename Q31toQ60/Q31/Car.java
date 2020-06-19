package Q31toQ60.Q31;

public class Car extends Vehicle {

    int y;
    Car() {
        super();
    //    this (20);   Constructor iki ayri constructor cagiramaz
    }

    Car(int y ){
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}
