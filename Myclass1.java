public class Myclass1 {
    // static variable
    static int count = 0;

    public Myclass1() {
        count++;// increment the count when an object is created
    }

    public static void main(String[] args) {
        Myclass1 m1 = new Myclass1();
        System.out.println("Count:" + Myclass1.count);
    }
}