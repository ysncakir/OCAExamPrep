package Q151toQ181;

public class Q172 {

}

abstract class Toy {

    public abstract int calculatePrice (Toy t);
    public void printToy (Toy t){
        System.out.println(t);
    }
}

class EduToy extends Toy{

    @Override
    public int calculatePrice(Toy t) {
        return 0;
    }
}

class ConsToy extends Toy {

    @Override
    public int calculatePrice(Toy t) {
        return 0;
    }
}