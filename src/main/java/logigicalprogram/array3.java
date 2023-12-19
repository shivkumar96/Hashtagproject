package logigicalprogram;

public class array3 {
public static void main(String[] args) {
	int a[]= {1,5,8,3,8,9,5};

	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}
	}
	
}
}
