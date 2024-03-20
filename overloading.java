class overloading
{
void substract(int a,int b)
{
System.out.println(a-b);
}
void substract(int a,int b,int c)
{
System.out.println(a-b-c);
}
public static void main(String []args)
{
overloading m=new overloading();
m.substract(2,3,4);
m.substract(2,9);
System.out.println("Vedant Solanki 500121550");
}
}
