import java.util.Scanner;

public class SimpleStudentInfo {
    public static void main(String[] args) {

        System.out.println("Satyam saini \n Sapid=500118640");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student's grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter student's GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}
 