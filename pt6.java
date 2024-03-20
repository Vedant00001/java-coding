import java.util.*;
public class pt6 {
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i+n;j++)
            {
                if((i+j)>n  && (j+i)%2==0 )
                 System.out.print(i);
                 else
                 System.out.print(" ");
            }

             System.out.print("\n");
        }

    }
    
}
