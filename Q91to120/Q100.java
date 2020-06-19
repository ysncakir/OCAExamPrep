package Q91to120;

public class Q100 {

}

class CD {
    int r;
    CD (int r) {
        this.r =r;
    }
}

class DVD extends CD {
    int c;
    DVD(int r, int c) {
        super(r);
        this.c = c;
    }

    public static void main(String[] args) {

        DVD dvd = new DVD(10,20);
    }
}

// subclass Q91to120.DVD de constructor olusturmak icin super (r) gerekli.