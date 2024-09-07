

class demo1
{
	String LaptopName="Suha";
	int RAM=30;
	int ROM=89;
	String CuteName="Suhayl";
	void display()
	{
		System.out.println(LaptopName);
		System.out.println(RAM);
		System.out.println(ROM);
		System.out.println(CuteName);
	}

}
class Laptop
{
	public static void main(String[] args) 
	{
	    demo1 d1=new demo1();
		d1.display();
	}
}
