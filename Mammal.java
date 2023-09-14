interface Mammal {
    void mammalSound();

    void sleep();
}

class Man implements Mammal {
    public void mammalSound() {
        System.out.println("The man shouts hey hey");
    }

    public void sleep() {
        System.out.println("The man sleeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Man m = new Man();
        m.mammalSound();
        m.sleep();
    }
}