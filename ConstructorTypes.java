class Example2
{
	int x;
	String y;

	Example2()
	{
		System.out.println("Hello World");
	}
	Example2(int x,String y);
	{
		System.out.println(x);
		System.out.println(y);
	}
	Example2(int x,String y,float z);
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	Example2(demo dl);
	{
		this.a=x;
		this.b=y;
		System.out.println(this.x);
		System.out.println(this.y);

	}

class ConstructorTypes
{
	public static void main(String[] args) 
	{
		Example2 d1= new Example2();
		Example2 d2 = new Example2(20,"Suha");
		Example2 d3= new Example2(20,"fa", 1.2f);
		Example2 d4=new Example2(d2);
		

	}
}
}

