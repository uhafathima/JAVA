class phone
{
	static int a=10;
	static int b=90;
	static int c;
	static void display1()
	{
		System.out.println("This is IPhone");
	}
	static void display2()
	{
		System.out.println("This is Lenova");
	}
	static void display3()
	{
		System.out.println("This is samsung");
	}
	static void display4()
	{
		c=a+b;
		System.out.println(c);
	}



}
class Mobile 
{
	public static void main(String[] args) 
	{
		//phone a1 =new phone();
		phone.display1();
		phone.display2();
		phone.display3();
		phone.display4();
	}
}
