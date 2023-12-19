package logigicalprogram;

public class String10 
{
	public static void main(String[] args)
	{
		String s="shivkumar123";
		
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				break;
			}
			System.out.print(s.charAt(i));
		}
		for(int i=s.length()-1; i>=0; i--)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}	
}
