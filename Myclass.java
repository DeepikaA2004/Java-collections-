public class Myclass {
    // static variable
    static int count = 0;

    public Myclass() {
        count++;// increment the count when an object is created
    }

    public static void main(String[] args) {
        System.out.println("Count:" + Myclass.count);
    }
}