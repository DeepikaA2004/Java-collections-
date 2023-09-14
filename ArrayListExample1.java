import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> electronicitems = new ArrayList<>();
        electronicitems.add("capacitors");
        electronicitems.add("resistors");
        electronicitems.add("diodes");
        System.out.println("electronic items in a kit: ");
        for (String item : electronicitems) {
            System.out.println(item);
        }
    }
}