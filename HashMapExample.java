import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>(); // String ---> camelcase
        capitals.put("USA", "Washington D.C.");
        capitals.put("UK", "LONDON");
        capitals.put("INDIA", "NEW DELHI");
        System.out.println("capitals in the map: ");
        for (String country : capitals.keySet()) {
            String capital = capitals.get(country);
            System.out.println("Capital of " + country + ": " + capital);
        }
    }
}