import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int c=0;
		int b=0;
        while(a!=0)
		{

		
		   System.out.print(a%10);
           a=a/10;
		}
	}
}
/*op
123
3
2
1
