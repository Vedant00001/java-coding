import java.util.*;
public class funcion3 {
    public static int Factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        int fact=1;
        while(n!=0)
        {
            fact=fact*n;
            n=n-1;
        }
        return fact;

    }
    public static void main(String args[])
    {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=Factorial(n);
        System.out.println("The facrorial of number "+n+"is"+fact);
    }
    
}
