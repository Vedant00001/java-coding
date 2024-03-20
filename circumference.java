import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("satyam saini\nSAP-500118650");

        scanner.close();
    }
}