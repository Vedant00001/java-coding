import java.util.*;
public class pt8 {
   public static void main(String args[]) 
   {
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=n-i;j>=1;j--)
        {
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
            System.out.print("*");
        }
        for(int j=2;j<=i;j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
    }
   
    for(int i=1;i<=n;i++)
    {
        for(int j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int j=n;j>=i;j--)
        {
          System.out.print("*");
        }
       
        for(int j=n-1;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }

   }
}
