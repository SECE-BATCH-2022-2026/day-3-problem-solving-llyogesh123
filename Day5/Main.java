import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> studentSet = new HashSet<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            boolean added = studentSet.add(new Student(roll, name));

            if (!added) {
                System.out.println("⚠ Student with Roll No " + roll + " already exists! Duplicate not added.");
            }
        }

        System.out.println("\nAll Students:");
        for (Student s : studentSet) {
            System.out.println(s);
        }

        sc.close();
    }
}
