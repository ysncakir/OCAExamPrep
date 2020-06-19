package Q121toQ150;

public class Q128 {

    public static void main(String[] args) {

        Caller c = new Caller();

        c.init(); // public yapinca erisebildi
    }
}

class Caller {
    public void init () {
        System.out.println("Initialized");
    }

    private void start () {
        init();
        System.out.println("started");
    }
}


// c objesi asagidaki Caller classin methodlari private oldugu icin
// erisemez. Onlari public yapmak lazim