package Q121toQ150;

public class Q142 {

    public static void main(String[] args) {

        Book book1 = new Ebook();
        book1.readBook();
    }

}

interface Readable {
    public void readBook ();
    public void setBookMark ();

}

abstract class Book implements Readable {
    public void readBook (){

    }

}

class Ebook extends Book {

    public void readBook (){

    }

    @Override
    public void setBookMark() {

    }

}


// Ebook class oldugu icin Interface deki tum metodlari override yapmasi lazim.
// Onun ucun setBookMark da Ebook class da override edilmelo