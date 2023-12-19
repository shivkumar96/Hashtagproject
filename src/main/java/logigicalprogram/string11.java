package logigicalprogram;

public class string11 {
	public static void main(String args[])
	{
		String s="121";
		String rev="";
		
		String p=s;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals(p))
		{
			System.out.println("string is plandrome");
		}
		else {
			System.out.println("string is not plandrome");
		}
		}
	

}
