import java.util.*;
public class pattern1 {
public static void main(String[]args )
{
     System.out.println("Enter the number");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=n-1;
     for(int i=1;i<=m;i++)
     {
        for(int j=1;j<=n;j++)
        {
            if(i==1 || j==1 || i==m ||j==n)
            {
                System.out.print("*");
            }
            else{
        System.out.print(" ");     
        }
     }
     System.err.println("\n");
}    
}
}
