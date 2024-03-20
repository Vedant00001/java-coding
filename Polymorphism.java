public class Polymorphism {
    
   public int add(int a, int b) {
       return a + b;
   }
   public int add(int a, int b, int c) {
       return a + b + c;
   }
   public double add(double a, double b) {
       return a + b;
   }

   public static void main(String[] args) {
       Polymorphism obj = new Polymorphism();

       
       System.out.println("Sum of 5 and 7 is: " + obj.add(5, 7));
       System.out.println("Sum of 5, 7, and 10 is: " + obj.add(5, 7, 10));
       System.out.println("Sum of 3.5 and 4.2 is: " + obj.add(3.5, 4.2));
      System.out.println("Name: Vedant Solanki " + "\n" + "SAP ID: 500121550");
   }
}
