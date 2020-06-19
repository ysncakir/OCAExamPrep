package Q61toQ90;

public class Q90 {

    static class MyException extends RuntimeException {

    }

    public static void main(String[] args) {

        try {
            method1();
        } catch (Q85.MyException ne) {
            System.out.println("A");
        }
    }


    public static void method1 () {

        try {
            throw Math.random() > 0.5 ? new Q85.MyException() : new RuntimeException();
        } catch (Exception re) {
            System.out.println("B");
        }

    }
}

// Math.random ==> 0 ile 1 arasi bir deger veriyor
// metod icindeki ifade true da olsa false da olsa B yazilacak cunku try catch ile
// method icinde handle edilmis olacak
