import java.util.*;
public class pt4 {
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(i<=n)
                {
             if( j<=i ||  (i+j)>2*n)
             {
                System.out.print("x");
             }
             else{
                System.out.print(" ");
             }
            }
            else{
                if((i+j)<=(2*n)+1 || j>=i )
                {
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            }
            System.out.print("\n");
        }
        
       
    }
    
}
