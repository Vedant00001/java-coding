import java.util.*;
public class pt3 {
    public static void main(String args[])
    {
        System.out.print("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                   System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }
}
