class Student {
    int id;
    String name;
    int age; // Declare the 'age' variable

    Student(int i, String n, int a) { // Constructor with three parameters
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age); // Added space for readability
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "karan", 21);
        Student s2 = new Student(222, "Aryan", 22);
        s1.display();
        s2.display();
    }
}