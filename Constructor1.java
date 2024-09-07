class demo
{
	  int i=7;
	void display()
	{
		 
		System.out.println("Hello");
	}
	demo()
	{
		i++;

		System.out.println(i);
	}
}
class Constructor1
{
	public static void main(String[] args) 
	{
		
		demo d1= new demo();
		d1.display();
		//System.out.println(i);
	}
}
