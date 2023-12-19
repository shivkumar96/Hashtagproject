package logigicalprogram;

public class string6 {
	
	public static void main(String[] args) {
		String s="shiv shiv shiv shiv sh sh kh kh";
		String s1[]=s.split("");
		for(int i=0; i<s1.length; i++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				if(s1[i].equals(s1[j]))
				{
					System.out.print(s1[i]+",");

					break;

				}
				
			}
		}
		
		
		
		
	}

}
