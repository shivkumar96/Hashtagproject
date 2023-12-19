package logigicalprogram;

public class Array2 {
	public static void main(String[] args) {
		int a[]= {1,5,8,3,8,9};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;

				}
			}
			System.out.print(a[i]+",");

		}

	}

}
