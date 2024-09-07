class demo
{
	//int age;
	//String name;
int x;
String y;

	void display( int x ,String y)
	{
		System.out.println("Hello");
		System.out.println(x);
		System.out.println(y);
		this.age=x;
		this.name=y;
	}
    void SampleData()
	{
		System.out.println("Age" + x);
		System.out.println("Name" +y);
	}
	
class Constructor2
{
	public static void main(String[] args) 
	{
		demo d1= new demo();
		d1.display(100,"Suha");
        
		d1.SampleData();
	}
}
}
