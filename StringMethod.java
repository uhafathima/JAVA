class StringMethod
{
	public static void main(String[] args) 
	{
		/*//Method 1[Trim]]
		String s1="  Hello java  ";
		System.out.println(s1.length());
		System.out.println(s1.trim());
		s1=s1.trim();
		System.out.println(s1);
		System.out.println(s1.length());

         //Method 2[Index]
		 String s2="java Coding";
		 System.out.println(s1.indexOf('a'));
		 System.out.println(s1.indexOf('z'));
		 System.out.println(s1.lastIndexOf('a'));
		// Method 3 CONTAINS
		//String s1="Welcome to java";
		//System.out.println(s1.contains("to"));

		//String s2="Welcome #to#java";
		String s2[]=s1.split("#");
		for(String s:s2)
		{
			System.out.println(s);
		}
		String s2[]=s1.split(//s);
		for(String s:s2)
		{
		System.out.println(s);
		}
		
		String s1=("Hello world java to coding to coding");
		{
		System.out.println(s1.replace('o','H'));
		System.out.println(s1.replace("to","From"));
		System.out.println(s1.replaceAll("O","H"));
		System.out.println(s1.replaceAll("java","python"));
		
		}*/

	   //STRING MEMORY ALLOCATION

	   String s1="java";
	   String s2="java";
	   String s3=new String("java");
	   String s4=new String("java");
	   System.out.println(s1.equals(s2));
	   System.out.println(s1==s2);
	   System.out.println(s3.equals(s4));// check by value
	   System.out.println(s3==s4); // check by memory
		
	}
}
