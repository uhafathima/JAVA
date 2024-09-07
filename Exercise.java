class garden
{
	int applePrice=20;
	int applecount=5;
	int multiply;
	void totalmoney()
	{
		multiply=applecount*applePrice;
		System.out.println("Total amount is"+multiply);
	}


}
class Exercise 
{
	public static void main(String[] args) 
	{
		garden g1=new garden();
		g1.totalmoney();

		//System.out.println("Hello World!");
	}
}
