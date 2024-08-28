//remove duplicate /push zero to last
package sample;

import java.util.Arrays;

public class Main {
	public static void main(String[]args)
	{
	int a[]= {3,4,5,6,9,9,7,3,4,5,6,6,6,9,2,3,1,5,4};
	for(int i=0;i<a.length;i++)
	{
		int j=i+1;
		while(j<a.length)
		{
			if(a[i]==a[j])
			{
				a[i]=0;
			}
			j++;
		}
	}
	int j=a.length-1;
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			a[count++]=a[i];
		}
			
	}
	while(count<a.length)
	{
		a[count++]=0;
	}
	for(int e:a)
		System.out.print(e);
}
}