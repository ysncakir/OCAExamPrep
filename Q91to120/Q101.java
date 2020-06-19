package Q91to120;

public class Q101 {


}

abstract class Planet {

    protected void revolve () {

    }

    abstract void rotate () ;
}

class Earth extends Planet {

    protected void revolve () {    // private verilmis

    }

    @Override
    protected void rotate() {   // private verilmis

    }
}

// override yaptigimiz zaman access modifier weaker olamaz. Private verildigi icin onlari asgari
// protected yapmak lazim
