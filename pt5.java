import java.util.*;
public class pt5 {
    public static void main(String args[])
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(2*n)-1;j++)
            {
                if((i+j)>n && (i+j)<=2*n)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


    }
    
}
