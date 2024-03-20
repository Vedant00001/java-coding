class parent
{
	public void m1()
	{
		System.out.println("Parent Method");
	}
}
class Child extends parent
{
	public void m2()
	{
		System.out.println("Child Method");
	}
}
class TestPC
{
	public static void main(String args[])
	{
		parent p1=new Child();
		p1.m1();
		
	}
}