class Demo1
{
	static int x=20;
	void display1()
	{
		System.out.println(x);
	}
	void display2()
	{
		float x1=7.8f;
		System.out.println(x1);
	}
	void display3()
	{
		String x2="suhair";
		System.out.println(x2);
	}
}
class Demo2
{
	String y="Suhayl";
	void display()
	{
		System.out.println(y);
	}

}

class ClassExample 
{
	public static void main(String[] args) 
	{
		Demo1 a1=new Demo1();
		a1.display1();
		Demo2 a2= new Demo2();
		a2.display();
		Demo1 a3=new Demo1();
		a3.display2();
		Demo1 a4=new Demo1();
		a4.display3();
	}
}
