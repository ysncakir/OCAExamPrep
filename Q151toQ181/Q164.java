package Q151toQ181;

public class Q164 {
    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014};

        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e != key){
                continue;
            //    count++;
            }
            // count++; buraya konulsa sonuc 2 olurdu
        }
        System.out.println(count + " found");
    }

}
 // return, break, continue arkasina herhangi bir sey konamaz