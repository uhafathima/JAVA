import java.util.Scanner;
class StringExample 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		System.out.println("The String is:"+s1);
		System.out.println("The length of the string is:"+s1.length());
		String upperCase="", lowerCase="",whitespace="", specialChars="", digits="", vowels=""; 
         int upper=0, lower=0, special=0, digit=0, vowel=0, count=0; 
        for(char c1:s1.toCharArray()) 
        { 
         if(Character.isUpperCase(c1)) 
		{ 
		upperCase+=c1; 
		upper++; 
		}
		else if(Character.isLowerCase(c1)) 
		{ 
		lowerCase+=c1; 
		lower++; 
		}
		else if(Character.isDigit(c1)) 
		{
		 digits+=c1; 
		 digit++; 
		}
		else if(Character.isWhitespace (c1)) 
		{ 
		whitespace+=c1; 
		} 
		else 
		{ 
		specialChars+=c1; 
		special++;  
		} 
		if("AEIOUaeiou".indexOf(c1)!=-1) 
		{ 
		vowels+=c1; 
		vowel++; 
		} 
	} 
		System.out.println("Uppercase letters are: "+upperCase);
		System.out.println("Lowercase letters are: "+lowerCase); 
		System.out.println("Number of digits: "+digits); 
		System.out.println("Special characters are: "+specialChars);
		System.out.println("Vowels are: "+vowels); 
		System.out.println(); 
		System.out.println("Number of Uppercase: "+upper); 
		System.out.println("Number of Lowercase: "+lower); 
		System.out.println("Number of digits: "+digit); 
		System.out.println("Number of whitespaces: "+whitespace.length()); 
		System.out.println("Number of special characters: "+special); 
		System.out.println("Number of vowels: "+vowel); 
			}
     	}
