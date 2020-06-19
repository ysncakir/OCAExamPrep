package Q151toQ181;

public class Q166 {

    public static void main(String[] args) {
        Planet [] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2)
        };

        System.out.println(planets); // hashcode verir
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }
}

class Planet {
    public String name;
    public int moons;

    public Planet (String name, int moons) {
        this.name= name;
        this.moons = moons;
    }
}

// Array i dorek yazdiramadigi icin haschode verir
// planets[2].name Earth ve  planets[2].moons = 1