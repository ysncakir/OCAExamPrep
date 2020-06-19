package Q61toQ90;

public class Q66 {

    static int count = 0;
    int i =0;

    public void changeCount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {

        Q66 check1 = new Q66();
        Q66 check2 = new Q66();

        check1.changeCount();
        check2.changeCount();

        System.out.print(check1.count + " : " + check2.count);

        // count static oldugu icin ilk object de 5 ulasiyor ve ikincisinde 5 den basliyor

    }
}
