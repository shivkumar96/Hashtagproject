package logigicalprogram;

public class String5 {
	public static void main(String[] args) {
		String s="shivkumar pandharpure";
		char s1[]=s.toCharArray();
		
		for(int i=0; i<s1.length; i++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				if(s1[i]==s1[j])
				{
					System.out.print(s1[i]+" ,");
				}
			}
		}
	}

}
