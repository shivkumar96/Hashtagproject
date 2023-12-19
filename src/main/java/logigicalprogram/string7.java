package logigicalprogram;

public class string7 {
public static void main(String[] args) {
	String s="shiv123";
	int sum=0;
	
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			sum=sum+Character.getNumericValue(s.charAt(i));
			
		}
	}
	System.out.println(sum);
}
}
