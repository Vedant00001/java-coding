class usingscanner
{
	public static void main(String args[])
	{
		scanner s=new scanner(System.in);
		int a,b;
		System.out.println("Enter First Number: ");
		a=s.nextInt();
		System.out.println("Enter Second Number: ");
		b=s.nextInt();
		int c=a+b;
		System.out.println("Addition is :"+c);
	}
}
