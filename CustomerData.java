import java.util.Scanner;

public class CustomerData {
    public static void main(String[] args) {

        System.out.println("Vedant Solanki \n Sapid=500121550");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter customer's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter customer's phone number: ");
        long phoneNumber = scanner.nextLong();

        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);

        scanner.close();
     }
}
