package Q61toQ90;

public class Q81 {

    int id;
    String name;

    public Q81(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Q61toQ90.Q81{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Q81 p1 = new Q81(101, "Pen");
        System.out.println(p1);

        Q81 p2 = new Q81(101, "Pen");
        System.out.println(p2);

        Q81 p3 = p1;
        System.out.println(p3);

        boolean ans1 = p1==p2;

        System.out.println(ans1);  // new keyword ile yapinca == ile esitlenmez

        boolean ans2 = p1.name.equals(p2.name);

        System.out.println(ans2);



    }
}
