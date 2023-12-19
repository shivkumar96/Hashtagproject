package amezon;


public class demo {
	public static void main(String[] args) {
		String name="shivkumar";
int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			count=0;
			
			char ch =name.charAt(i); 
			
			for(int j=0;j<name.length();j++)
			{
				char c=name.charAt(j);
				
				if(j<i && ch==c)
				{
					break;
				}
				
				if(ch==c)
				{
					count++;
				}
			}
			if(count !=0)
			{
				System.out.println("char "+ ch + " found number of times "+count);
			}
			
		}
	}


		
	}


