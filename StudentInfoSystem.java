import java.util.Scanner;

public class StudentInfoSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        double totalMarks = 0;

        // Input student details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // clear buffer

            students[i] = new Student(name, age, marks);
            totalMarks += marks;
        }

        // Display output
        System.out.println("\n----- Student Details -----");
        for (Student s : students) {
            s.display();
        }

        double average = totalMarks / students.length;
        System.out.println("\nAverage Marks: " + average);

        sc.close();
    }
}
