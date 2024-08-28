//three groups Array-2826
package sample;

import java.util.Arrays;

public class Main {
	public static void main(String[]args)
	{
	int a[]= {1,3,2,1,3,3};
	int  j=0;
	int i=1;
	int count=0;
	while(i<a.length)
	{
		if(a[j]<=a[i])
		{
			i++;
			j++;
			
		}
		else
		{
			count++;
			a[i]=a[j];
			i++;
			j++;
		}
		
	}
	System.out.print(count);
}

}