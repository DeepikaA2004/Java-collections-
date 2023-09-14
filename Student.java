class Student {
    int id;
    String name;

    Student(int i, String n) { // Constructor with parameters
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name); // Added space for readability
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "karan");
        Student s2 = new Student(222, "Aryan");
        s1.display();
        s2.display();
    }
}