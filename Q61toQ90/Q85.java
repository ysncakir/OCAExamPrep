package Q61toQ90;

import java.io.IOException;

public class Q85 {

    static class MyException extends RuntimeException {

    }

    public static void main(String[] args) {

        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }


    public static void method1 () {

        try {
            throw 3 < 10 ? new MyException() : new IOException();
        } catch (IOException ie ) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.println("B");
        }

    }
}

// onemli nokta : Method zaten hatayi handle ettigi icin, yukarida
// cagirdimizda hicbir zaman hata vermeyecek. Yani catch blok calismaz. A hicbir zaman yazdirilmaz