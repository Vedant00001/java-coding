import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Enter Physics marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Enter Chemistry marks: ");
            int chemistryMarks = scanner.nextInt();
            System.out.print("Enter Maths marks: ");
            int mathsMarks = scanner.nextInt();

            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double percentage = (totalMarks / 300) * 100;

            System.out.println("\nRoll No: " + rollNo);
            System.out.println("Physics: " + physicsMarks);
            System.out.println("Chemistry: " + chemistryMarks);
            System.out.println("Maths: " + mathsMarks);

            if (physicsMarks < 40 || chemistryMarks < 40 || mathsMarks < 40) {
                System.out.println("Result: Fail");
            } else {
                if (percentage >= 75) {
                    System.out.println("Result: Distinction");
                } else if (percentage >= 60) {
                    System.out.println("Result: First Division");
                } else if (percentage >= 50) {
                    System.out.println("Result: Second Division");
                } else if (percentage >= 40) {
                    System.out.println("Result: Third Division");
                }
            }
        }
        scanner.close();
    }
}
