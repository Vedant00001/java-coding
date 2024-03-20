public class Calculator {
    public static void main(String[] args) {
        System.out.println("Vedant Solanki \n Sapid=500121550");
        if (args.length != 3) {
            System.out.println("java CommandLineCalculator");
            System.exit(1);
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        double result = 0;

        switch (args[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero .");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        }

        System.out.println("Result: " + result);
   }
}
