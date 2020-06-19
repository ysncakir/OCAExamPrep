package Q1toQ30;

public class Q14 {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        int k = (j += i )/ 5; //6 ==> j will be reassigned

        System.out.println(i + " : " + j + " : "+ k);
    }
}
