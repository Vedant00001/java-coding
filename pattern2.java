import java.util.*;

import javax.lang.model.util.SimpleElementVisitor14;
public class pattern2 {
public static void main(String[]args )
{
     System.out.println("Enter the number");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
        {
            if((i+j)>n)
            {
            System.out.print("x");
        }
        else{
            System.out.print(" ");
        }
    }
        System.out.print("\n");
    }
}
}
