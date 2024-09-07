m./////class demo
{
	int x;
	int y;

	void display( int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	demo(String A,String B)
	{
	  System.out.println(A);
	  System.out.println(B);
	}

}
class ParametrizedConstructor 
{
	public static void main(String[] args) 
	{
		demo d1=new demo();
		demo d2=new demo();
		d1.display(20,20);
		d2.display("suha","fath");
		//System.out.println("Hello World!");
	}
}
