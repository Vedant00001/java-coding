class MoverCase2
{
public void m1(String s)
{
System.out.println("String arg");
}
public void m1(Object o)
{
System.out.println("Object arg");
}
public static void main(String args[])
{
MoverCase2 c=new MoverCase2();
c.m1(new Object());
c.m1("Saurabh");
c.m1(null);
}
}
