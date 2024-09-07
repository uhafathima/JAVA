class ExceptionExample 
{
	public static void main(String[] args) 
	{
		//int a=100;
		//int b=0;
	//	String s1="null";
	//	System.out.println(a%b);
	/*	try
		{
			int a=100;
		int b=0;
		System.out.println(a%b);
			
		}
		catch (Exception ex)a
		{
			System.out.println("Invalid case");
		}*/
	//	System.out.println(a%b);//.ArithmeticException: / by zero at ExceptionExample.main(ExceptionExample.java:7)
      // int a=100;
		//int b=0;
	//	String s1= null;
	//	System.out.println(a%b);
	//System.out.println(s1.length());	System.out.println(s1.length());
		try
		{
		int a=100;
		int b=0;
		String s1=" nulluu";
		int x[]={6,1,8};
	//	String s2="java";
		System.out.println(a%b);
		System.out.println(x[0]);
        System.out.println(s1.length());
	//	System.out.println(s2.CharAt(3));
			
		}
		catch ( ArithmeticException ex)
		{
			
			System.out.println("Invalid case");
		
			 try
	     {
			 int a=10;
			 int b=0;
			 System.out.println(a%b);

			
	     }
	     catch (ArithmeticException ex1)
	     {
			 System.out.println("wrong case");
	     }
		 finally
			{
             System.out.println("he");
			}
		}
			
		
		
		catch(NullPointerException ex)
		{
			int a=10;
			System.out.println(+a);
			System.out.println("Invalid statement");
		}
		
		catch(Exception ex)
		{
			System.out.println("Wrong case");
		}
	     
		 
		
		finally
		{
			System.out.println("enter");
		}
			
	
	}
}
	
