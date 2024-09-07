class ExceptionExercise
{
	public static void main(String[] args) 
	{
		try
		{
		  int a[]={234}	;
		  System.out.println(a[7]);
		}
		catch (Error ex)
		{
			//EXCEPTION METHOD
			ex.printStackTrace();//  ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1 at ExceptionExercise.main(ExceptionExercise.java:8) 1. DETAILED INFORMATION
		System.out.println(ex.getMessage());// Index 7 out of bounds for length 1 2. ERROR ONLY
			System.out.println(ex.getStackTrace());// 3.oBJECT SHOW
		}
		//System.out.println("Hello World!");  
	}
}
