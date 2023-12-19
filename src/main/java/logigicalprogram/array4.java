package logigicalprogram;

import java.util.Arrays;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,8,3,8,9,5};
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+",");
		}
		{
			
		}

	}

}
