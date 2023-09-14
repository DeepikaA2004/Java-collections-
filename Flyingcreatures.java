abstract class Flyingcreatures {
    abstract int getFlyingcreatures(); // Abstract method
}

class Eagle extends Flyingcreatures {
    int flyingwithwings() {
        System.out.println("Eagle flies at a higher altitude");
        return 1; // Return an integer as required
    }
}

class Bat extends Flyingcreatures {
    int flyingwithwings() {
        System.out.println("Bat flies at a lower altitude");
        return 2; // Return an integer as required
    }
}

public class Main {
    public static void main(String[] args) {
        Flyingcreatures fc;

        // Create an instance of Eagle and call its method
        fc = new Eagle();
        int eagleAltitude = fc.flyingwithwings();
        System.out.println("Eagle altitude: " + eagleAltitude);

        // Create an instance of Bat and call its method
        fc = new Bat();
        int batAltitude = fc.flyingwithwings();
        System.out.println("Bat altitude: " + batAltitude);
    }
}