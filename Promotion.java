public class Promotion {

   public int add(int a, int b) {
       return a + b;
   }

   public double add(double a, double b) {
       return a + b;
   }

   public double add(int a, double b) {
       return a + b;
   }

   public static void main(String[] args) {
       Promotion obj = new Promotion();

       int sumInt = obj.add(5, 7);
       System.out.println("Sum of 5 and 7 (int): " + sumInt);

       double sumDouble = obj.add(3.5, 4.2);
       System.out.println("Sum of 3.5 and 4.2 (double): " + sumDouble);

       double sumPromotion = obj.add(10, 5.5);
       System.out.println("Sum of 10 (int) and 5.5 (double) with type promotion: " + sumPromotion);
System.out.println("Name: Vedant Solanki " + "\n" + "SAP ID: 500121550");
   }
}
