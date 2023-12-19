package logigicalprogram;

public class array5 {
public static void main(String[] args) {
	int a[]= {1,2,3,5,6,7,8};
	int sum=0;
	
	for(int i=0; i<a.length; i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);

	System.out.println();
	int sum1=0;
	for(int j=1; j<=8; j++)
	{
		sum1=sum+j;
	}
	System.out.println(sum1);

}
}
