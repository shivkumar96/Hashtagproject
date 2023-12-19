package logigicalprogram;

public class string4 {
public static void main(String[] args) {
	
	String s="shivkumar";
	
	char c[]=s.toCharArray();
	
	for(int i=0; i<c.length; i++)
	{
		for(int j=i+1; j<c.length; j++)
		{
			if(c[i]>c[j])
			{
				char c1=c[i];
				c[i]=c[j];
				c[j]=c1;
				

			}

		}
		System.out.print(c[i]+" ");

	}
	

}
}
