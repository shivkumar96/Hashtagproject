package logigicalprogram;

public class string1 {
	public static void main(String[] args) {
		String s="shivkumar pandharpure is a student";
		String s1[]=s.split(" ");
		
		String rev="";
		
		for(String word:s1)
		{
			String revword="";
			for(int i=word.length()-1; i>=0; i--)
			{
				revword=revword+word.charAt(i);

			}
			rev=rev+revword+" ";

		}

		System.out.println(rev);

	}
}
