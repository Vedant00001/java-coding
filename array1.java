import java.util.*;
public class array1 {
    public static void main(String args[])
    {
       System.out.println("Enter the size of arrray");
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[] number=new int[size];
       
       for(int i=0;i<size;i++)
       {
        number[i]=sc.nextInt();
       }
       System.out.println("Enter the number to be find");
       int n=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(number[i]==n)
            System.out.println(i);
        }

    }
    
}
