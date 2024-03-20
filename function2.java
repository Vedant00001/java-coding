import java.util.*;
public class function2 {
    public static int Multiply(int a,int b)
    {
     int mul=a*b;
     return mul;
    } 
    public static void main(String args[])
    {
       System.out.println("Enter value of first");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       System.out.println("Enter value of second");
       int b=sc.nextInt();
      int  mul= Multiply(a,b);
       System.out.println("Multiplication of two numbers is "+mul);
    }
    
}
