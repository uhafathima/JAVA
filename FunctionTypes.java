//No ReturnType with No Argument
//No return type with Argument
// Return type with Argument
// Return type with No argument

class Sample1
{

	//1. NO RETURN TYPE WITH NO ARGUMENT

	/*int x=20;
	void display()
	{
	System.out.println(x);
    }

	// 2.NO RETURN TYPE WITH ARGUMENT
	void display(int x , String y, float n, char z)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(n);
		System.out.println(z);
	}

	// RETURN TYPE  WITH ARGUMENT
	  
	  int display(int x,int y)
	{
		  int c = x+y;
		  return c;
	}*/

	//RETURN TYPE WITH NO ARGUMENT
	int display()
	{
		int a=2,b=3;
	    int c=a+b;
		return c;
	}


}
class FunctionTypes  
{
	public static void main(String[] args) 
	{

		Sample1 S1=new Sample1();
		//S1.display( 20,10);
		//int ans=S1.display(10,10);
		//System.out.println(ans);
		int ans=S1.display();
		System.out.println(ans);
	}
}
