class parent
{
	public void m1()
	{
		System.out.println("Parent Method");
	}
}
class Child extends Parent
{
	public void m2()
	{
		Systeem.out.println("Child Method");
	}
}
class TestPC
{
	public static void main(String args[])
	{
		parent p=new parent();
		p.m1();
		p.m2();
	}
}