class practice
{
	String b;// Global variable
	void display()
	{
		static int x;
		String a="suha";//local variable
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}
}
class Example
{
	public static void main(String[] args) 
	{
		practice a1=new practice();
		a1.display();
	
	}
}
