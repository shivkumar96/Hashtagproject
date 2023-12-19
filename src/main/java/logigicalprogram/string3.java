package logigicalprogram;

public class string3 {
	
public static void main(String[] args) {
	String s="shivkumar is a boy";
	
	String s1[]=s.split(" ");
String c=s1[1];
s1[1]=s1[1];
s1[2]=c;
	
	
	

	for(int i=0; i<s1.length; i++)
	{
		System.out.print(s1[i]+" ");

		
	}
}

}
