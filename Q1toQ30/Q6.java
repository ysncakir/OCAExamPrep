package Q1toQ30;

import java.io.IOException;
class X {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}


public class Q6 {

    public static void main(String[] args)  {
        X obj = new X();
        try {
            obj.printFileContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



// throw new Exception handle etmek lazim methodun kendisinde
// ayrica methodun cagirildigi yerde de handle etmek lazim




