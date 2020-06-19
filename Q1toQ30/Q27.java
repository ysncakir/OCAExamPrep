package Q1toQ30;

public class Q27 {

        public static int stVar = 100;
        public int var = 200;
        public String toString(){
            return stVar + " : "+ var;  //  obj i yazdirmak icin lazim bu metod
        }

    public static void main(String[] args) {

            Q27 t1 = new Q27();
            t1.var = 300;
           System.out.println(t1);   // 100 : 300
            Q27 t2 = new Q27();
            t2.stVar = 300;
           System.out.println(t2);  //300 : 200




    }


}
