import java.util.*;
public class function {
    public static void Name(String name)
    {
        System.out.println(name);
        return;
    }
public static void main(String args[])
{
    System.out.print("Enter a name");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    Name(name);
}
}
