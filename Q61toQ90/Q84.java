package Q61toQ90;

public class Q84 {

    String name;
    int age =25;

    public Q84(String name) {
       setName(name);
    }

    public Q84(String name, int age) {
       // Q61toQ90.Q84(name); // boyle constructor cagrilmaz
        this(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show (){
        return name + " " + age;
    }

    public static void main(String[] args) {

        Q84 p1 = new Q84("Jesse");
        Q84 p2 = new Q84("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());

    }

    // contructor call yanlis oldugu icin compile error var.
}
