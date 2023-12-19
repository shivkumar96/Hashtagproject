package logigicalprogram;

public class string12 
{
public static void main(String[] args) 
{
	
    int i=1235467;
    String s=Integer.toString(i);
    System.out.println(s.length());

    String rev="";

         for(int q=7; q>=1; q--)
         {
	      rev=rev+s.charAt(i);
         }
         System.out.println(rev);
}
}
