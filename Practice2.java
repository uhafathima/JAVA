import java.util.Scanner;
class Practice2
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		/*String Meghana =scan.next();
		
		    
		if (Meghana.equals("dead"))
		{
			System.out.println("Surya meets Ramya");
		}
        else
		{
			System.out.println("Surya weds meghana");
		}
	}
}*/
       int number1=scan.nextInt();
	  
	   if( number1%3==0 && number1%5==0)
		{
		   System.out.println("divisible");
		}
		else
		{
			System.out.println("Not divisible");
		}
	}
}
	