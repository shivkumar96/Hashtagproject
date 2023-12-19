package logigicalprogram;

public class string13 {
	public static void main(String[] args) {
		
		
		String s="shivkumar";
		
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			for(int j=0; j<s.length(); j++)
              {
				count=0;
				char c=s.charAt(j);
				if(j<i &&ch==c)
				{
					break;
				}
				if(ch==c)
				{
					count++;
				}
				if(count!=0) 
				{

				}	            System.out.println("char"+ ch +"found no of times"+count);


              }
		}
	}

}
