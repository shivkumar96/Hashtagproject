package logigicalprogram;


public class Array1 {
	
public static void main(String[] args) {
	int a[]= {1,5,8,3,8,9};
	int max=0,min=0;
	a[0]=max;
	a[0]=min;
	
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}

	}
	for(int i=0; i<a.length; i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);

}	
}
