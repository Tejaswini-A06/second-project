class Student {
    String name;
    int age;
    double marks;

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name +
                " | Age: " + age +
                " | Marks: " + marks);
    }
}

