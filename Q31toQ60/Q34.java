package Q31toQ60;

public class Q34 {

    String type = "Canine";
    int maxSpeed = 60;

    Q34(){ }

    Q34 (String type, int maxSpeed){
        this.type =type;
        this.maxSpeed = maxSpeed;
    }

    static class WildAnimal extends Q34{

        String bounds;

        WildAnimal (String bounds) {
//            super();
            this.bounds = bounds;
        }

        WildAnimal (String type, int maxSpeed, String bounds) {
            super(type, maxSpeed);    //eklenmesi lazim
            this.bounds = bounds;     // eklenmesi lazim
        }
    }

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");

        System.out.println(wolf.type + " "+ wolf.maxSpeed + " "+ wolf.bounds);
        System.out.println(tiger.type + " "+ tiger.maxSpeed + " "+ tiger.bounds);
    }
}
