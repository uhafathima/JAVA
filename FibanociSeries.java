class FibanociSeries 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=1;
		for(int i=1;i<=13;i++)
		{
		int c=a+b;
		int temp=c;
		 
		 b=temp;
		 a=b;
       System.out.println(temp);
		}
		}
	}

