package logigicalprogram;


public class string8 {

	public static void main(String[] args) {
		String s1="shiv&&123 SHIV";
		
		int upp = 0 ,small = 0,spcl = 0,digit = 0,space=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char c=s1.charAt(i);
			
			if(c>='A'&& c<='Z')
			{
				upp++;
			}
			else if(c>='a'&& c<='z')
			{
				small++;
			}
			else if(c>='0'&& c<='9')
			{
				digit++;
				
			}
			else if(c>=' '&& c<=' ') 
			{
				space++;
			}
			else {
				spcl++;
			}
		}
		System.out.println(upp);
		System.out.println(small);
		System.out.println(digit);
		System.out.println(space);
		System.out.println(spcl);
		
		
		
		
		

	}

}
